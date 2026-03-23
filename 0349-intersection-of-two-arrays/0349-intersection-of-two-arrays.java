class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int temp=-1;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]) {
                if(nums1[i] != temp){
                ans.add(nums1[i]);
                temp = nums1[i];
                }
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]) j++;
            else i++;
        }
        int[] arr = new int[ans.size()];
        for(int k=0;k<ans.size();k++){
                arr[k] = ans.get(k);
        }
        return arr;
    }
}