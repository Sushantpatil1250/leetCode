class Solution {
    public int[] findDiagonalOrder(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        int r[] = new int[m *n];
        int k =0;
        for (int i =0 ; i< m+n -1; i++){
            int rowI = i<n ? 0: i-n+1;
            int colI = i<n ? i :n-1;

          if(i % 2==0){
            List<Integer> a = new ArrayList<>();
            while(rowI < m && colI>=0){
                a.add(arr[rowI][colI]);
                colI--;
                rowI++;

            }
            Collections.reverse(a);
            for(int id = 0 ; id<a.size() ; id++){
                r[k] = a.get(id);
                k++;
            }



          }
          else{
              while(rowI < m && colI>=0){
                r[k] = arr[rowI][colI];
                k++;
                colI--;
                rowI++;

            }
          }
        }
        return r;

    }
}