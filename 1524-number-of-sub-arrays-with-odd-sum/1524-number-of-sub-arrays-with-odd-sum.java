// class Solution {
//     public int numOfSubarrays(int[] arr) {
        
//         int oddcount = 0;

//         for(int i = 0 ; i<arr.length ; i++){
//             int sum =0;
//             for(int j = i ; j <arr.length ; j++ ){
//                 sum = sum +arr[j];
//                 if(sum%2 != 0) oddcount++;


//             }
//         }
//         return oddcount;
//     }
// }

class Solution {
    public int numOfSubarrays(int[] arr) {

        int mod = 1000000007;

        int odd = 0;
        int even = 1;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum % 2 == 0) {
                count = count + odd;
                even++;
            }
            else {
                count = count + even;
                odd++;
            }

            count = count % mod;
        }

        return count;
    }
}
