class Solution {
    public int smallestIndex(int[] nums) {
for(int i = 0 ; i < nums.length  ; i++){
            int r =0;


    while(nums[i]!=0){
     r += nums[i] %10;
    nums[i] = nums[i]/10;

   
}
 if(i == r) return i;
    
}       
return -1; 
        


    }
}