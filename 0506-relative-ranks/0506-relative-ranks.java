class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        int f = 0,s = 0,t = 0;
        int fidx = -1,sidx = -1,tidx = -1;
        for(int i=0;i<score.length;i++){
            if(score[i]>f){
                t = s;
                tidx = sidx;
                s = f;
                sidx = fidx;
                f = score[i];
                fidx = i;
            }
            else if(score[i]>s && score[i]<f){
                t = s;
                tidx = sidx;
                s = score[i];
                sidx = i;
                
            }
            else if(score[i]>t && score[i]<s) {
                t = score[i];
                tidx = i;
            }
        }
        if(fidx != -1) str[fidx] = "Gold Medal";
        if(sidx != -1) str[sidx] = "Silver Medal";
        if(tidx != -1) str[tidx] = "Bronze Medal";

        int k=score.length;
        for(int i=0;i<score.length-3;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
          for(int j=0;j<score.length;j++){
            if(str[j] == null && score[j]<min){
                min = score[j];
                mindx = j;
            }
          }
          str[mindx] = Integer.toString(k);
          k--;
        }

        return str;

    }
}