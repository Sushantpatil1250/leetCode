
class Solution {
    public int minInsertions(String s) {
        // int open = 0;
        // int insertions = 0;

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);

        //     if (ch == '(') {
        //         open++;
        //     } else {
        //         if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
        //             i++;
        //         } else {
        //             insertions++;
        //         }

        //         if (open > 0) {
        //             open--;
        //         } else {
        //             insertions++;
        //         }
        //     }
        // }

        // return insertions + 2 * open;
        int count = 0;
        int res =0;
        int need =0;

        for(int ch :s.toCharArray()){
            if(ch == '('){
                count = count +2;
                if(count %2 !=0){
                    res++;
                    count--;
                }
            }
            else{
                count--;

                if(count < 0){
                    res++;
                    count =1;
                }
            }
        }
        return res +count;


    }
}