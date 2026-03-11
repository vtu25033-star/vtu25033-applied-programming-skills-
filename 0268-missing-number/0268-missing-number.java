class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int Arraysum = 0;
        for(int num:nums) Arraysum+=num;
        return sum-Arraysum;
    }
}