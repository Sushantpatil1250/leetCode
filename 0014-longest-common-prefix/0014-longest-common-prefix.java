class Solution {
    public int longestCount(String s1 , String s2){
        if(s1.length() ==0 || s2.length() ==0){
            return 0;
        }

        if(s1.length() >s2.length()){
            return longestCount(s2 ,s1);
        }

        int count = 0;

        for(int i = 0 ; i<s1.length() ; i++){
            if(s1.charAt(i) != s2.charAt(i))
            {
                return count;
            }
            count++;
        }
        return count;
    }


    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0 ){
            return "";
        }

        String f =strs[0];
        int mincount = Integer.MAX_VALUE;

        for(int n =0 ; n<strs.length  ; n++ ){
            int count = longestCount(f , strs[n]);
            mincount = Math.min(mincount , count);


        } 
        return f.substring(0 , mincount);
        
    }
}