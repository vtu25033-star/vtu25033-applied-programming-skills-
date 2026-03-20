class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for(int i:nums){
            if(i>largest){
                third = second;
                second = largest;
                largest = i;
            }
            else if (i > second && i != largest){
                third = second; 
                second = i;}
            else if(i > third && i != largest && i != second) third = i;
        }
        return (third == Long.MIN_VALUE) ? (int)largest : (int)third;
    
    }
}