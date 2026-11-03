class Solution {
    public int minMoves(int[] nums) {
        int t =0;

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max) {
                max= nums[i];
            }
        }
        for(int i =0 ; i< nums.length ; i++){
            if(max != nums[i]){
                t = t+ Math.abs(max -nums[i]);
            }
        }
        return t;

        
    }
}