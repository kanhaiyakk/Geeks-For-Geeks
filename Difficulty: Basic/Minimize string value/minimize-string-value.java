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
            
            String input[] = read.readLine().split(" ");
            String s = input[0];
            int k = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.minValue(s,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int minValue(String S,int K) {
        // code here
       if(S.length()<K){
           return 0;
       }
       int[] count=new int[26];
       for(char ch : S.toCharArray()){
          count[ch-'a']++; 
       }
       Arrays.sort(count);
       while(K>0){
           count[25]--;
           Arrays.sort(count);
           K--;
       }
       int res=0;
       for(int num : count){
           res+=(num*num);
       }
        return res;
            
        
    }
}