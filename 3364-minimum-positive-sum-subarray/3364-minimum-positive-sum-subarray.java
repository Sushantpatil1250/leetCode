class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum = Integer.MAX_VALUE;

        for(int i = 0 ;i< nums.size() ; i++){
            int x =0 ;
            for(int j =i ; j <nums.size() ; j++ ){

                  x = x + nums.get(j);
                if(j - i+1 <= r && j - i+1>=l && x >0){
                   
                    if(sum > x){
                        sum =x;
                    }
                }

            }
        }
      return sum == Integer.MAX_VALUE?-1 :sum;
        
      }
        
    }
