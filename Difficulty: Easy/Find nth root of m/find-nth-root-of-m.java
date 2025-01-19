//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        if(m==0) return 0;
        int left=1;
        int right=m;
        while(left<=right){
            int mid=left+(right-left)/2;
            long mPow=(long) Math.pow(mid,n);
            if(mPow==m){
                return mid;
            }else if(mPow<m){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}