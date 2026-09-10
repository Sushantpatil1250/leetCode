class Solution {
    public int[] sortArrayByParity(int[] arr) {
                int[] ans = new int[arr.length];


        int c = 0;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] % 2 ==0){
                ans[c++] = arr[i];
            }
        }
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ans[c++] = arr[i];
            }
        // return ans;
        
    }
            return ans;

}
}
