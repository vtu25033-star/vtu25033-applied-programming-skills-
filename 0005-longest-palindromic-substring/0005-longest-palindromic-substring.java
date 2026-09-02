class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        StringBuilder sb = new StringBuilder("^");
        for (int i = 0; i < s.length(); i++) {
            sb.append("#").append(s.charAt(i));
        }
        sb.append("#$");
        char[] T = sb.toString().toCharArray();
        
        int n = T.length;
        int[] P = new int[n];
        int C = 0, R = 0;
        
        for (int i = 1; i < n - 1; i++) {
            int iMirror = 2 * C - i;
            
            if (R > i) {
                P[i] = Math.min(R - i, P[iMirror]);
            }
            
            while (T[i + 1 + P[i]] == T[i - 1 - P[i]]) {
                P[i]++;
            }
            
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }
        
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }
        
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start, start + maxLen);
    }
}