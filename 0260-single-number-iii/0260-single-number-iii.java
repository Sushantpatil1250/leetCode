class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;
        for(int e : nums){
            xor = xor ^ e;
        }

        int mask = xor & (xor- 1) ^ xor ;

        int b1 =0;
        int b2 = 0;
        for(int i : nums){
            if((i & mask) != 0) {
                b1 = b1 ^ i;
            }else{
                b2 = b2 ^i;
            }
        }
        int [] ans = {b1 , b2};

        return ans;

        
        
    }
}