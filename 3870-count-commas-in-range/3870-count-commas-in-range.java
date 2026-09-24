class Solution {
    public int countCommas(int n) {

        // if(n<1000){
        //     return 0;
        // }
        // int x = n - 1000 +1;
        // return x;

        return (n <1000)? 0 : n-999; 
        
    }
}