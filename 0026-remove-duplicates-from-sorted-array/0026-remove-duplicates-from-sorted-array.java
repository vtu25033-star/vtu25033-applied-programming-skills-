class Solution {
    public int removeDuplicates(int[] arr) {
        int ele = arr[0];
        int j=0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=ele){
                ele = arr[i];
                arr[j+1] = arr[i]; 
                j++;
            }
        }
        return j+1;
    }
}