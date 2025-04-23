//{ Driver Code Starts
import java.io.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum=0,rSum=0,maxSum=0;
        for(int i=0;i<=k-1;i++){
            lSum+=cardPoints[i];
            maxSum=lSum;
        }
        int rIndex=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lSum=lSum-cardPoints[i];
            rSum=rSum+cardPoints[rIndex];
            rIndex=rIndex-1;
            maxSum=Math.max(maxSum,lSum+rSum);

        }
        return maxSum;
    }
}



//{ Driver Code Starts.
class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            Solution solution = new Solution();
            System.out.println(solution.maxScore(nums, d));
            System.out.println("~");
        }

        // scanner.close();
    }
}

// } Driver Code Ends