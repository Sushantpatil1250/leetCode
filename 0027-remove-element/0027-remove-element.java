class Solution {
    public int removeElement(int[] arr , int val) {
        ArrayList <Integer> a = new ArrayList<>();
        int count =0;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
            
        }
        
        return count;
        
    }
}