class Solution {
    public int maximumCount(int[] nums) {
        int l = 0,n = nums.length - 1,r = n;
        // Find the starting index of positive number
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] <= 0) l = mid + 1;
            else r = mid - 1;
        }
        // Subtract n - left(l) + 1
        int positive = n - l + 1;  // Here we will get count of positive numbers.

        // Find last index of negative number
        l = 0;
        n = nums.length - 1;
        r = n;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] >= 0) r = mid - 1;
            else l = mid + 1;
        }
        // Add right(r) + 1
        int negative = r + 1;  // Here we will get count of negative numbers.
        // Return the maximum count of positive and negative numbers
        return Math.max(positive, negative);
    }
}