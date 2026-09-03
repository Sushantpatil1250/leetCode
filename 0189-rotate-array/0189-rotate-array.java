class Solution {
    public void rotate(int[] arr, int k) {

        int n = arr.length;
        int b [] = new int[n];
        int c =0;
        k = k % n;

        int s = n-k;

        for(int i = s ; i<n ; i++){

            b[c] = arr[i];
            c++;
        }
         for(int i = 0; i<s ; i++){

            b[c] = arr[i];
            c++;
        }
         for(int i = 0; i < n; i++) {
            arr[i] = b[i];
        }
    }
}