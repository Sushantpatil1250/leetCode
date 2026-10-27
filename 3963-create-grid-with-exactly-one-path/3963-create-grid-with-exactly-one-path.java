class Solution {
    public String[] createGrid(int m, int n) {
        
        String [] arr = new String[m];
        for(int i = 0  ; i < m ; i++){
            char[] x = new char[n];
            for(int j = 0 ; j < n ; j++){
                if(i == 0 || j == n -1){

                    x[j] ='.';

                }else {
                    x[j] = '#';
                }
            }
             
             arr[i] = new String(x);

        }
        return arr;

    }
}