class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int mid = nums.length/2;
        int a = 0;
        for(int i=0;i<nums.length;i+=2){
            arr[i]=nums[a];
            arr[i+1]=nums[mid];
            a++;
            mid++;
        }
        return arr;
    }
}