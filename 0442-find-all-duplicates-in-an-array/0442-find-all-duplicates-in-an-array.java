class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i] == i+1) i++;
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
            if(nums[j] != j+1) arr.add(nums[j]);
        }

        return arr;
    }
}