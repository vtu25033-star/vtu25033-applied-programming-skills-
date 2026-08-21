class Solution {
    public String frequencySort(String s) {
        char[] charArray = s.toCharArray();
        int[] arr = new int[123];
        StringBuilder sb = new StringBuilder();
        for(char ch : charArray){
            arr[(int)ch]++;
        }
        for(int i = 0;i<charArray.length;i++){
            int max = Integer.MIN_VALUE;
            int mindx = -1;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>max){
                    max = arr[j];
                    mindx = j;
                }
            }
            for(int k = 1; k <= max; k++){
                sb.append((char) mindx);
            }
            arr[mindx] = 0;
        }
        return sb.toString();
    }
}
