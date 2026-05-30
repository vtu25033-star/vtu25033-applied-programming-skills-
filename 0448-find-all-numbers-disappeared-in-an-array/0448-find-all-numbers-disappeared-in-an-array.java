class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        // int[] arr = new int[nums.length+1];
        // for(int i=0;i<nums.length;i++){
        //      arr[nums[i]]++;
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(arr[i] == 0){
        //         ans.add(i);
        //     }
        // }
        // return ans;

        int n = nums.length;
        int i = 0;
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
            if(nums[j] != j+1) arr.add(j+1);
        }

        return arr;
    }
}