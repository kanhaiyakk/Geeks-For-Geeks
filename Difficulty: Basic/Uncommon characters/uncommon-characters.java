//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String A = sc.next();
            String B = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.uncommonChars(A, B));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for(char ch : s1.toCharArray()) {
            freqA[ch - 'a']++;
        }

        for(char ch : s2.toCharArray()) {
            freqB[ch - 'a']++;
        }

        StringBuilder uncommon = new StringBuilder();

        for(int i=0; i<26; i++) {
            if((freqA[i]>0 && freqB[i]==0) || (freqA[i]==0 && freqB[i]>0)) {
                uncommon.append((char) (i+'a'));
            }
        }

        return uncommon.length() == 0 ? "" : uncommon.toString();

    //     // code here
    //     int[] freq=new int[26];
    //     for(char ch1:s1.toCharArray()){
    //         freq[ch1-'a']++;
    //     }
    //     for(char ch2:s2.toCharArray()){
    //         freq[ch2-'a']++;
    //     }
    //     StringBuilder result = new StringBuilder();
    //     for (char c = 0; c < 26; c++) {
    //         if (freq[c - 'a'] == 1) {
    //             result.append(c);
    //         }
    //     }

        
    //   char[] arr=result.toString().toCharArray();
    //   Arrays.sort(arr);
    //   return new String(arr);
    }
}