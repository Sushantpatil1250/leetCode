class Solution {
    public int matrixScore(int[][] mat) {

        int r = mat.length;
        int c = mat[0].length;

        for(int i = 0 ; i<r  ;i++){
            {
                if(mat[i][0] == 0){

                    for(int j = 0 ; j< c ; j++){
                    if(mat[i][j] == 0){
                        mat[i][j] = 1;
                    }
                    else{
                        mat[i][j] = 0;

                    }

                 }

                }
                 
            }
        }
       for (int i = 1; i < c; i++) {
    int ones = 0;

    for (int j = 0; j < r; j++) {
        if (mat[j][i] == 1) {
            ones++;
        }
    }

    if (ones < r - ones) {
        for (int j = 0; j < r; j++) {
            mat[j][i] = 1 - mat[j][i];
        }
    }
}
        int sum = 0;
        int pow = 1;
         for(int j = c-1 ; j>=0 ; j-- ){
            int ones = 0;
            // int zero = 0;
            for(int i=0 ; i < r  ; i++ ){

                if(mat[i][j] == 1 ) ones++;
                

            }
            sum = sum + pow * ones;
            pow =pow * 2 ;
           
         }
         return sum;


        
        
    }
}