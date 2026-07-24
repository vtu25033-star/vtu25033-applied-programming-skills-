class Solution {
    public void moveZeroes(int[] arr) {
        int j = 0,i=0;
        while(i<arr.length){
            if(arr[i] != 0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
            i++;
        }
        
    }
}