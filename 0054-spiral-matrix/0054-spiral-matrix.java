class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = arr.length,m = arr[0].length;
        int firstrow = 0,firstcol = 0,lastrow = n - 1,lastcol = m-1;
        while(firstrow<=lastrow  &&  firstcol<=lastcol){
            // FIRST ROW 
            for(int j=firstcol;j<=lastcol;j++){
                ans.add(arr[firstrow][j]);
            }
            firstrow++;
            if(firstrow>lastrow || firstcol>lastcol) break;
            // LAST COL
            for(int i=firstrow;i<=lastrow;i++){
                ans.add(arr[i][lastcol]);
            }
            lastcol--;
            if(firstrow>lastrow || firstcol>lastcol) break;
            // LAST ROW 
            for(int j=lastcol;j>=firstcol;j--){
                ans.add(arr[lastrow][j]);
            }
            lastrow--;
            if(firstrow>lastrow || firstcol>lastcol) break;
            // FIRST COL
            for(int i=lastrow;i>=firstrow;i--){
                ans.add(arr[i][firstcol]);
            }
            firstcol++;
        }
        return ans;
    }
}