class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n=arr.length;
        int total=0,leftMax=0,rightMax=0;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]<=arr[right]){
                if(leftMax>arr[left]){
                    total+=leftMax-arr[left];
                }else{
                    leftMax=arr[left];
                }
                left++;
            }else{
                if(rightMax>arr[right]){
                    total+=rightMax-arr[right];
                }else{
                    rightMax=arr[right];
                }
                right--;
            }
        }
        return total;
    }
}
