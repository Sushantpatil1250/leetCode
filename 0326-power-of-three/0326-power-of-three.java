class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        // else{
        //     for(int i = 0 ; n>=Math.pow(3 ,i) ; i++){
        //         double x =Math.pow(3 ,i);
        //         if(x == n){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        while(n % 3 ==0){
            n = n/3;
        }

        if( n == 1) return true;
        else return false;

    }
}