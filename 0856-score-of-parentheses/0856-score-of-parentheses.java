class Solution {
    public int scoreOfParentheses(String s) {
        // int count =0;

        Stack <Integer> st = new Stack<>();
        st.push(0);

        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(0);
            }
            else{
                int score =1;
                int inn  = st.pop();

                if(inn == 0){
                    score = 1;
                }
                else{
                    score = 2 * inn ;
                }

                st.push(score + st.pop());
            }


        }
        return st.pop();

        // for(int i = 0 ; i<s.length() ; i++){
        //     if(s.charAt(i) == '('){
        //         st.push(i);
        //     }
        //     else{
        //         if(st.isEmpty()){
        //             st.push(i);
        //         }
        //         else{
        //             st.pop();
        //             count = count +1;

        //         }
            
        //     }

        // }

    
        //     return count;


    }
}