//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.HashMap;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(s));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestSubstrDistinctChars(String s) {
       int maxLength=0;
       int left=0;
       int n=s.length();
       HashMap<Character, Integer> map = new HashMap<>();
        for(int right=0;right<n;right++){
          char c=s.charAt(right);
          if(map.containsKey(c)){
              
              left=Math.max(left, map.get(c)+1);
          }
          map.put(c,right);
          maxLength=Math.max(maxLength,right-left+1);
        }
          return maxLength;
    }
}