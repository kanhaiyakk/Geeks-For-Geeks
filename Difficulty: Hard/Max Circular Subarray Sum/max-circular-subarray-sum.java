class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int total = 0;
        int maxSum = arr[0], currMax = 0;
        int minSum = arr[0], currMin = 0;
        
        for (int num : arr) {
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
            
            total += num;
        }
        
        if (maxSum < 0) {
            return maxSum; 
        }
        
        return Math.max(maxSum, total - minSum);
    }
}
