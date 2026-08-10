class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int j = i+1;
            arr[i] = prices[i];
            while(j<n){
                if(prices[i]>=prices[j]){
                    arr[i] = prices[i] - prices[j];
                    break;
                }
                j++;
            }
        }

        return arr;
    }
}