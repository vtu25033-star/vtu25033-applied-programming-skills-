class Solution {
    // public int search(int[] nums, int target) {
    //    int l=0,r=nums.length - 1,mid;
    //     while(l<=r){
    //            mid = (l+r)/2;
    //            if(nums[mid]==target){
    //             return mid;
    //            }
    //            else if(nums[mid] > target){
    //                    r = mid - 1;
    //            }
    //            else{
    //             l = mid + 1;
    //            }
    //     }
    //     return -1;
    // }

//  RECURSION BHAI

    public int helper(int[] nums, int target,int lo,int hi) {        
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(nums[mid]== target) return mid;
        else if(nums[mid]>target) return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi);
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
}