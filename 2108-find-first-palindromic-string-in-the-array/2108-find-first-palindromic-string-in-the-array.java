class Solution {
    public String firstPalindrome(String[] words) {

        for(int i = 0 ; i< words.length ; i++){
            String s = words[i];
            String r = "" ;

            for(int j= s.length() -1 ; j>=0 ; j--){
                r = r + s.charAt(j);
            }
            if(s.equals(r)) return s;
        }
        return "";
        
    }
}