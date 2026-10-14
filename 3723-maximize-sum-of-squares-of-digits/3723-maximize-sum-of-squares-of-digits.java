class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if(sum > 9 * num) return "";
        StringBuilder r = new StringBuilder();

        while(sum >= 9){
            r.append('9');
            sum = sum - 9;
            num--;
        }
        if(num >0 && sum > 0){
            r.append((char)(sum + '0'));
            num--;
        }
        while(num > 0){
            r.append('0');
            num--;
        }
        return r.toString();
        
    }
}