class Solution {
    public int strStr(String a, String b ) {
        if(a.contains(b)){
            int c = a.indexOf(b);
            return c;
        }
        return -1;
        

    }
}