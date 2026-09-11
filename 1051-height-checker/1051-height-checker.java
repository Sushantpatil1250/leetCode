class Solution {
    public int heightChecker(int[] arr) {
      int a[] = new int[arr.length];
      int k =0;
      int c=0;

      for(int x:arr){
        a[k++] = x;
      }
      Arrays.sort(a);

      for(int i = 0 ; i<arr.length ; i++){
        if(arr[i] != a[i]){
            c++;
        }

      }
      return c;

        
    }
}