class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int num:arr){
            sum+=num;
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
