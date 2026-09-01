class Solution {
    public int findNumbers(int[] arr) {
        int count=0;

        // Arrayist<Integer> a = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(9<arr[i] && 100>arr[i] || 999<arr[i] && arr[i]<10000 || arr[i] ==100000)
            {count++;
            } 


        }
        return count;

        
    }
}