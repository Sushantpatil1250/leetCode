class Solution {
    public int calPoints(String[] arr) {
        

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i].equals("C")) st.pop();

            else if(arr[i].equals("D")) {
                int x= st.peek() * 2;
                st.push(x);
            }
            else if(arr[i].equals("+")){
                int top = st.pop();
                int top1 = st.peek();
                st.push(top);
                st.push(top + top1);
            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        int sum = 0;
        while(st.size() > 0){
            sum+= st.pop();

        }
        return sum;
    }
}