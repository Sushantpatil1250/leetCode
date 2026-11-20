class Solution {
    public int subtractProductAndSum(int n) {
        int m = 1;
        int a = 0;
       while(n >0){
        int d = n%10;
        a = a + d;
        m = m *d;
        n = n /10;
       }
       return m -a;
        
    }
}