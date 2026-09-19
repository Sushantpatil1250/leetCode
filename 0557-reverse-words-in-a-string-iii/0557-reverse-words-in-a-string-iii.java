class Solution {
    public String reverseWords(String s) {

        String a[] = s.split(" ");

        for(int i = 0 ; i<a.length ; i++){
            a[i] =new StringBuilder(a[i]).reverse().toString();
        }
        String.join(" ", a);
        return String.join(" ", a);


        
    }
}