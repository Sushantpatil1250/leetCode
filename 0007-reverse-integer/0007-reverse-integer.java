class Solution {
    public int reverse(int x) {
        int rv =0;
        if(x <Integer.MAX_VALUE )
         while(x!=0)
         {
           int digit = x%10;
           
             if (rv > Integer.MAX_VALUE/10 ||
                rv < Integer.MIN_VALUE/10 ) {
                return 0;}
                 rv=rv *10 +digit;
            x = x/10;
            System.out.println(rv);

         }
         return rv;
    }
    }
