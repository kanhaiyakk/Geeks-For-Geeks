//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if (ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        Map<Character,Integer> charMap=new HashMap<>();
        for(char ch:s.toCharArray()){
            charMap.put(ch, charMap.getOrDefault(ch, 0)+1);
            }
        for(char c:s.toCharArray()){
            if(charMap.get(c)==1){
                return c;
            }
        }
        return '$';
        // int[] freq=new int[26];
        // for(char ch:s.toCharArray()){
        //     freq[ch-'a']++;
        // }
        // for(char c='a' ; c<='z' ; c++){
        //     if(freq[c-'a']==1){
        //         return c ;
        //     }
        // }
        // return '$';
    }
}
