class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        else if(arr[n-1]>arr[n-2]) return n-1;
        int first = 1;
        int last = n - 2;
        while(first<=last){
            int mid = first + (last - first)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if(arr[mid] < arr[mid-1] && arr[mid]>arr[mid+1]) last = mid - 1;
            else first = mid + 1;
        }
        return 0;
    }
}