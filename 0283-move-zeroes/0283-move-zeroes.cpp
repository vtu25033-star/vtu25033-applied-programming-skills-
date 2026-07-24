class Solution {
public:
    void moveZeroes(vector<int>& arr) {
        int i = 0,j=0;
        size_t length = std::size(arr);
        while(j<length){
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