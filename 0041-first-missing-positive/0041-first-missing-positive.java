class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<nums.length){
            int idx = nums[i] - 1;
            if(nums[i] <= 0 || nums[i] == i+1 || nums[i] > n) {
                i++;
            }
            else{
                if(nums[idx] == nums[i]) i++;
                else
                {   int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                }
            }
        }

        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1) return j+1;
        }
        return n+1;
    }
}