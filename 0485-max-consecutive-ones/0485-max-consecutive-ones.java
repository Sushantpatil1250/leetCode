class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {

        int k = 0;
        // int j = 1;
        int n = arr.length-1;
        int count =0;
        int cou =0;

        while(k<=n){

            if(arr[k] == 1){
                count++;
                k++;
                if(cou<count){
                    cou = count;
                }
            }
            else{count = 0;
            k++;

            }
            
           

        }
        return cou;


    }
}