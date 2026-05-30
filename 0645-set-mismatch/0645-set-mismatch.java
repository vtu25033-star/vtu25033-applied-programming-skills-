class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int n = nums.length;
        int i = 0;
        int a = 1;
        while(i<n){
            if(nums[i] == i+1) {
                i++;
            }
            else{
                int idx = nums[i] - 1;
                if(nums[idx] == nums[i]) i++;
                else{
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                }
            }
        }

        for(int j = 0;j < nums.length;j++){
            if(nums[j] != j+1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        } 

        return arr;
    }
}