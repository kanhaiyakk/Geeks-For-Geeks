// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}
