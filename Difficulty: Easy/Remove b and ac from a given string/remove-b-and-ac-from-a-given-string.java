//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.stringFilter(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String stringFilter(String str) 
    {
       
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == 'b') {
                i++; 
            } else if (i < str.length() - 1 && str.charAt(i) == 'a' && str.charAt(i + 1) == 'c') {
                i += 2; 
            } else {
                result.append(str.charAt(i));
                i++; 
            }
        }

        return result.toString();
        
        // str=str.replace("b","");
        // str=str.replace("ac","");
        // return str;
    }
}