class Solution {
    public int[] sortedSquares(int[] arr) {

        int[] a = new int[arr.length];
                int[] b = new int[arr.length];


        for(int i = 0 ; i<arr.length ; i++){
            int x = Math.abs(arr[i]) *  Math.abs(arr[i]);
            a[i] = x;
        }

         Arrays.sort(a);
        return a;
        
    }
}