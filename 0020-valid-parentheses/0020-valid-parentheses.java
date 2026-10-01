class Solution {
    public char getvalue(char ch){
        switch(ch){
            case ']' :return '[';
            case '}' :return '{';
            case ')' :return '(';
            default :return ' ';
        }
    }
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        String o = "({[";
        String c = ")}]";

        for(char ch : s.toCharArray()){
            if(o.indexOf(ch) != -1){
                st.push(ch);
            }
            else{
                if(st.size() == 0){
                    return false;
                }
                char temp = st.pop();
                if(getvalue(ch) != temp){
                return false;
                }
            }
          
        }
          return st.size() ==0;
        
    }
}