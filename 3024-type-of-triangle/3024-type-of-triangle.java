
class Solution {
    public String triangleType(int[] nums) {

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // Check whether triangle is valid
        if (a + b <= c || b + c <= a || a + c <= b) {
            return "none";
        }

        // All three sides equal
        if (a == b && b == c) {
            return "equilateral";
        }

        // Any two sides equal
        else if (a == b || b == c || a == c) {
            return "isosceles";
        }

        // All sides different
        else {
            return "scalene";
        }
    }
}