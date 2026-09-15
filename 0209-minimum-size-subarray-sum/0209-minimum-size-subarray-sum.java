class Solution {
    public int minSubArrayLen(int t, int[] arr) {

        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;

        for(int r =0 ; r<arr.length ; r++ ){
            sum = sum +arr[r];

            while(t<=sum){
                minLen =Math.min(minLen , r -l+1);
                                sum-=arr[l];

                l++;
                // sum-=arr[l];

            }
        }
        return minLen == Integer.MAX_VALUE?0:minLen;
        
    }
}