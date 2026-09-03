class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
    int arr3 [] = new int[arr1.length+arr2.length];
    int z =0;
    for(int i =0 ; i<arr1.length ; i++){
        arr3[z] =arr1[i];
                z++;

    }for(int i =0 ; i<arr2.length ; i++){
        arr3[z] =arr2[i];
                z++;

    }
    Arrays.sort(arr3);
        int n = arr3.length;

        if (n % 2 == 0) {
            return (arr3[n / 2 - 1] + arr3[n / 2]) / 2.0;
        } else {
            return arr3[n / 2];
        }

     
   

        
    }
}