class Solution {
    public int maxSubArray(int[] arr) {
        int maxend = 0;
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            maxend = Math.max(maxend+arr[i] , arr[i]);
            result = Math.max(maxend , result);
        }
        return result;
    }
}