class Solution {
    public boolean isMonotonic(int[] arr) {
        int count =0;
        int cou =0;
        int n= arr.length-1;
        

        for(int i =0 ; i<arr.length-1 ; i++){
            if(arr[i] <=arr[i+1]){
                count++;

            } if(arr[i] >=arr[i+1]){
                cou++;

            }
            
        }
        if(n ==count || n == cou ) return true;
        else return false;
        
    }
}