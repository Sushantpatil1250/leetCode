class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int s :nums){
            sum = sum +s;
        }
        int sum1 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            
            int s = nums[i];
            

            while(s >9){

                 int d =s % 10;
                sum1+=d;
                s = s/10;
            }
            sum1+=s;

        }
        return Math.abs(sum - sum1);
        
    }
}