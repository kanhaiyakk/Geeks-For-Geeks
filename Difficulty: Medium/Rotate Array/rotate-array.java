class Solution {
    public void rotateArr(int arr[], int d) {
       int n=arr.length;
       int[] temp=new int[n];
       d=d%n;
       for(int i=0;i<n;i++){
           temp[i]=arr[(i+d)%n];
       }
       for(int i=0;i<n;i++){
           arr[i]=temp[i];
       }
        
    }
}