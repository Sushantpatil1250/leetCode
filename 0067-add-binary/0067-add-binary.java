class Solution {
    public String addBinary(String a, String b) {

        if(a.length() <b.length()){
            return addBinary(b ,a);
        }
        int s = a.length();
        int d = b.length();
        StringBuilder r = new StringBuilder();

        int c = 0;
        int j =d-1;

        for(int i =s- 1 ; i>=0 ; i-- , j--){
            int sum = c;

            if(a.charAt(i) == '1'){
                sum = sum + 1;
                
            }
            if(j >= 0 && b.charAt(j) == '1')
            {
                sum = sum+1;
            }
            r.append(sum%2);

            c = sum /2;

        }
        if(c ==1){r.append(1);}
        // r.reverse();
        return r.reverse().toString();
        
    }
}