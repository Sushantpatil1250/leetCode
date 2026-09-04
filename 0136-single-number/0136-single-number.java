class Solution {
    public int singleNumber(int[] nums) {
        //  HashSet <Integer> a=new HashSet<>();
        
        // for (int i=1;i<nums.length;i++){
        //     if(a.contains(nums[i])){
        //          a.remove(nums[i]);
        //     }else{
        //         a.add(nums[i]);
        //     }
        // }
        // return a;

        int ans=0;
        for (int x: nums){
            ans=ans^x;
        }
        return ans;
    }
}
