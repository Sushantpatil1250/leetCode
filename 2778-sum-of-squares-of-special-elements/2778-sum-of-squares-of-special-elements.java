class Solution {
    public int sumOfSquares(int[] nums) {
        int len = nums.length;
        int res =0;

        for(int i =0 ; i<len ; i++){
            if(len % (i+1) == 0){
                int c = nums[i] *nums[i];
                res = res + c;

            }
        }
        return res;
        
    }
}