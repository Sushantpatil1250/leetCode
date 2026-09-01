class Solution {
    public void sortColors(int[] arr) {

int z = 0;
int o = 0;
int t = 0;
int i =0;
while(i <=arr.length-1){

if(arr[i] == 0){
    z++;
    i++;
}else if(arr[i] ==1 ){
    o++;
    i++;
}else if(arr[i] == 2){
    t++;
    i++;
}}
int x =0;
while(z-- >0) arr[x++] =0;
while(o-- >0) arr[x++] =1;
while(t-- >0) arr[x++] =2;



        
        
    }
}