class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i<n){
            if(arr[i] == i+1 || arr[i] == n) i++;
            else{
                int idx = arr[i] - 1;
                if(arr[idx] == arr[i]){
                    return arr[i];
                }
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        return 143;
    }
}