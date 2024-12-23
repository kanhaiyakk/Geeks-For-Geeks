//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.convert(str));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" "); // Split the string into words
        
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                result.append(" "); // Add a space between words
            }
            // Capitalize the first letter of each word and append
            result.append(words[i].substring(0, 1).toUpperCase());
            result.append(words[i].substring(1));
        }
        
        return result.toString(); // Return the final formatted string
        
      
    }
}