//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int l;
            l = sc.nextInt();

            int r;
            r = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.findXOR(l, r);

            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int findXOR(int l, int r) {
        
        return xorUpTo(r)^ xorUpTo(l-1);
    }
        
        public static int xorUpTo(int n){
            if(n<1) return 0;
            switch(n%4){
                case 0:return n;
                case 1: return 1;
                case 2: return n+1;
                case 3: return 0;
            }
            return 0;
        }
}