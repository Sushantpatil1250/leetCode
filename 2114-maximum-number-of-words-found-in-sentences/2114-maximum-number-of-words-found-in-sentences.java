class Solution {
    public int mostWordsFound(String[] s) {

        int max =0 ; 

        for(int i = 0 ; i< s.length ; i++){
            String se = s[i];
            String [] w = se.split(" ");
            if(w.length > max){
                max = w.length;
            }
        }
        return max;
    }
}