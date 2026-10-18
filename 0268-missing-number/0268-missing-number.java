class Solution {
    public int missingNumber(int[] nums) {

        // int n = nums.length;
        // int add=0;

        // int sum = n*(n+1)/2;
        // for(int s :nums){
        //     add +=s;
        // }
        // int result =sum-add;
        // return result;
        int x= nums.length;
        for(int i = 0 ; i< nums.length ; i++){
            x = x ^ i ^ nums[i];
        }
        return x;

        
    }
}