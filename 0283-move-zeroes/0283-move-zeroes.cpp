class Solution {
public:
    void moveZeroes(vector<int>& arr) {
        int i = 0,j=0;
        while(j<arr.size()){
            if(arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
    }
};