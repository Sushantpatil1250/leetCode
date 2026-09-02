class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max=0;

        for(int x :arr){
            if(x <min){
                min = x;
            }
            if( x -min > max){
                max = x-min;
            }
        }
        return max;


      
    }
}