// class Solution {
//     public int great(int ele,int[] arr){
//         for(int j=0;j<arr.length;j++){
//             if(arr[j]==ele){
//                 for(int i=j;i<arr.length;i++){
//                     if(arr[i] > ele) {
//                         return arr[i];
//                     }
//                 }
//                 break;
//             }
//         }
//         return -1;
//     }
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int[] a = new int[nums1.length]; 
//         for(int i=0;i<nums1.length;i++){
//             a[i] = great(nums1[i],nums2); 
//         }
//         return a;
//     }
// }
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        nge[n-1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek()) st.pop();
            if(st.size()==0) nge[i] = -1;
            else nge[i] = st.peek();
            st.push(arr[i]);
        }
        
        int[] a = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<arr.length;j++){
                if(nums1[i]==arr[j]){
                    a[i] = nge[j];
                    break;
                }
            }
        }
        return a;
        
    }
}