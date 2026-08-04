class Solution {
    public int great(int ele,int[] arr){
        for(int j=0;j<arr.length;j++){
            if(arr[j]==ele){
                for(int i=j;i<arr.length;i++){
                    if(arr[i] > ele) {
                        return arr[i];
                    }
                }
                break;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] a = new int[nums1.length]; 
        for(int i=0;i<nums1.length;i++){
            a[i] = great(nums1[i],nums2); 
        }
        return a;
    }
}