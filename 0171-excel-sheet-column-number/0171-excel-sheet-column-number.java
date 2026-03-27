class Solution {
    public int titleToNumber(String columnTitle) {
        int total = 0;
        int it = 1;
        for(int i=columnTitle.length()-1;i>=0;i--){
            char ch = columnTitle.charAt(i);
            total += ((int)ch - 64) * it;
            it*=26;
        }
        return total;
    }
}