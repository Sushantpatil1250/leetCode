class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);

        int len = nums.length;
        int m = nums[len / 2];
        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += Math.abs(m - nums[i]);
        }

        return sum;
    }
}