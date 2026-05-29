class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum = n*(n+1)/2;
        // int Arraysum = 0;
        // for(int num:nums) Arraysum+=num;
        // return sum-Arraysum;

        int i=0;
        int n = nums.length;
        while(i<nums.length){
            if(nums[i] == i || nums[i] == n) i++;
            else{
                int idx = nums[i];
                swap(nums,i,idx);
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j) return j;
        }
        return n;
    }
    private void swap (int[] arr,int i,int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}