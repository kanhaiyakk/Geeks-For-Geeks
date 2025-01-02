//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver_class {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine()); // testcases

        while (t-- > 0) {
            // input a number n
            int n = Integer.parseInt(read.readLine());

            // if n is less than equal to zero then
            // it can't be a power of 2 so we print No
            if (new Solution().isPowerofTwo(n) == true)
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(int n) {
        if(n==1) return true;
        if(n<=0 || n%2!=0){
            return false;
        }
        return isPowerofTwo(n/2);
        
        
        // using loop
        // if(n<=0) return false;
        // while(n%2==0 ){
        //     n=n/2;
        // }
        // return n==1;
        
        
        
        // Recursive 
        // if(n<=0) return false;
        // if(n==1) return true;
        // if(n>1){
        //     return n%2==0 && isPowerofTwo(n/2);
        // }
        // return false;
        
    }
}