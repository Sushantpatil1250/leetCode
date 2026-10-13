class Solution {
    public long maxAlternatingSum(int[] nums) {

        if(nums.length == 1){
            return nums[0] *nums[0];
        }
        
        for(int  i= 0 ; i<nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        long max =0 ; 
        int  l = 0  ; int  h = nums.length-1;
        while(l < h){
            max = max +nums[h];
            h--;
            max = max - nums[l];
            l++;

            if( l== h){
                max = max + nums[h];
            }
        }

        return (long)max; 

        
    }
}