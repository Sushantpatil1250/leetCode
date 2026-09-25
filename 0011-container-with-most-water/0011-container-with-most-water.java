class Solution {
    public int maxArea(int[] arr) {
        

        int l = 0;
        int h  = arr.length-1;
        int max = 0;

        while(l<h){
            int w = h-l;
            int he =Math.min(arr[l] ,arr[h]);

            int area = w *he;

            if(max <area){
                max = area;
            }
            if(arr[l]<arr[h])
            {
                l++;
            }
            else{
                h--;
            }


        }
        return max;
    }
}