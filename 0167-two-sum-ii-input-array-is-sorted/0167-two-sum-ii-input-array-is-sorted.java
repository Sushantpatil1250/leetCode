class Solution {
    public int[] twoSum(int[] arr, int t) {

        int l = 0;
        int h = arr.length-1;

        while(l<h){
            int sum = arr[h] +arr[l];
            if(sum == t){
                return new int []{l+1 ,h+1};
            }
            else if(t <sum){
                h--;
            }else {
                l++;
            }

        }
        return new int[]{};
        
    }
}