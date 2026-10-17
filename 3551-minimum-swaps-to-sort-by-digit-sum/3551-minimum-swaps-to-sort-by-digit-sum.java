// class Solution {
//     public int minSwaps(int[] arr) {

//         List<Integer> list = new ArrayList<>();

//         for(int i = 0 ; i< arr.length ; i++ ){
//             int num = arr[i];
//             int sum = 0;
//             int r = 0; 
//             while(num != 0){
//                  r = num % 10;
//                 sum = sum+r;
//                 num = num /10;
//             }
//             list.add(sum);
//         }
//         int count =0;

//         for(int i = 0 ; i<list.size()-1 ; i++){
//             for(int j = 0 ; j <list.size() -1 -i ; j++){
//                 if(list.get(j) > list.get(j+1)){
//                 int temp = list.get(j);
//                 list.set(j , list.get(j+1));
//                 list.set(j+1 , temp);

//                 count++;
//             }
//             }
//         }
//         return count;
        
//     }
// }
import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            list.add(sum);
        }

        Integer[] idx = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (i, j) -> {
            if (!list.get(i).equals(list.get(j))) {
                return list.get(i) - list.get(j);
            }
            return nums[i] - nums[j];
        });

        boolean[] visited = new boolean[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || idx[i] == i) {
                continue;
            }

            int j = i;
            int cycle = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = idx[j];
                cycle++;
            }

            count += cycle - 1;
        }

        return count;
    }
}