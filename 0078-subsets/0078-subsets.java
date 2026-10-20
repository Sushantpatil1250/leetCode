class Solution {
    public List<List<Integer>> subsets(int[] arr) {

        int m = 1 << arr.length ;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i< m ; i++){

            List<Integer> a = new ArrayList<>();
             for(int j = 0 ; j< arr.length ; j++){
                if((i >> j) % 2 == 1) a.add(arr[j]);
             }
             ans.add(a);

        }
        return ans;
        
    }
}