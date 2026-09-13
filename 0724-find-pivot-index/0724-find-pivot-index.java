class Solution {
    public int pivotIndex(int[] arr) {
        int rightsum =0;
        // int leftsum = 0;

        for(int i = 0 ; i<arr.length ; i++){
            rightsum +=arr[i];
        }
        int leftsum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(leftsum == rightsum-arr[i]){
                return i;
            }
            leftsum+=arr[i];
            rightsum-=arr[i];
        }

        return -1;





        
    }
}