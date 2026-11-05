class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count =0 ;

        for(int i = 0 ; i<arr1.length ; i++){
             int c =0;
            for(int j =0 ; j <arr2.length ; j++){
               
                int x = Math.abs(arr1[i] - arr2[j]);
                if(x > d) c++;
              
            }
              if(c == arr2.length) count++;
        }
        return count;
        
    }
}