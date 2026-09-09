class Solution {
    public int thirdMax(int[] arr) {
        
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++ ){
            if (arr[i] == f || arr[i] == s || arr[i] == t) {
                continue; 
            }
            if(f<arr[i]){
              t =s;

                 s=f;

                f= arr[i];
                
                
            }
            else if (arr[i] > s) {
                t = s;
                s = arr[i];
            }
            else if(arr[i] >t){
                t = arr[i];
                
            }
        } 
                return t == Long.MIN_VALUE ? (int) f : (int) t;



    }
}