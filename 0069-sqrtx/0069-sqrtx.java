class Solution {
    public int mySqrt(int x) {
        long s =0;

        for(long i = 1 ; i *i <=x ; i++){
            s = i;
        }
        return (int ) s;
        
    }
}