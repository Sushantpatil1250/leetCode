class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0 ; i<arr1.length ; i++){
            for(int j =0  ;j<arr2.length ; j++){
                if(arr1[i] == arr2[j] &&!a.contains(arr1[i])){

                    a.add(arr2[j]);


                }
            }
        }
        int f []=new int [a.size()];

        for(int i =0 ; i<a.size() ; i++){
            f[i] = a.get(i);
        } 

        return f;


        
    }
}