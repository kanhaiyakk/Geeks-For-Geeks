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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPanagram(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPanagram(String S) {
        if(S==null) return 0;
       Set<Character> set=new HashSet<>();
       S=S.toLowerCase();
       for(char ch:S.toCharArray()){
           if(ch>='a' && ch<='z'){
               set.add(ch);
           }
       }
       if(set.size()==26){
           return 1;
       }
       return 0;
        
    }
};