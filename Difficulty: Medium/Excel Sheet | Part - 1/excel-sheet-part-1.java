//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    
System.out.println("~");
}
	}
    
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public String excelColumn(int N){
        
        //  Your code here
        StringBuilder result=new StringBuilder();
        while(N>0){
            N--;
            int rem=N%26;
            char ch=(char)(rem+'A');
            result.append(ch);
            N /=26;
        }
        return result.reverse().toString();
        
        
    }
}