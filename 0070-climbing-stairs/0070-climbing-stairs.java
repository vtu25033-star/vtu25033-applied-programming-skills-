class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int first = 1,second = 2,total = 0;
        for(int i=3;i<=n;i++){
            total = first + second;
            first = second;
            second = total;
        }
        return total;
    }
}