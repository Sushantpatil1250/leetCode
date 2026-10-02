class Solution {
    public boolean valid(String s){
        int count = 0;

      for(char c:s.toCharArray()){
        if(c == '('){
            count = count +1;
        }
        else{
            count = count -1;
        }
        if(count <0) return false;
      }
      return count ==0;


    }
    public void generateParenthesishelper(String curr , int n , List<String> res){
        if(curr.length() == n*2){
            if(valid(curr)){
                res.add(curr);
            }
            return;
        }
        generateParenthesishelper(curr +'(',n,res);
        generateParenthesishelper(curr +')',n,res);


    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
         generateParenthesishelper("" ,n , res);
         return res;

        
    }
}