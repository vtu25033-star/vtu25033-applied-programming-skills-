class Solution {
    public int maximumCount(int[] nums) {
        int l = 0,n = nums.length - 1,r = n;
        // Find the starting index of positive number
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == 0) l = mid + 1;
            if(nums[mid] > 0) r = mid - 1;
            else l = mid + 1;
        }
        int positive = n - l + 1;

        // Find last index of negative number
        l = 0;
        n = nums.length - 1;
        r = n;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == 0) r = mid - 1;
            if(nums[mid] < 0) l = mid + 1;
            else r = mid - 1;
        }
        int negative = r + 1;
        return Math.max(positive, negative);
    }
}