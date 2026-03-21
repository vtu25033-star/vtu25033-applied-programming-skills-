class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=1;
        while(j<nums.length){
            if(nums[i] != nums[j]){
                j++;
                i++;
            }
            else return true;
        }
        return false;
    }
}