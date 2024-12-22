//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String line = br.readLine().trim();

            Solution obj = new Solution();

            System.out.println(obj.getMaxOccuringChar(line));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s) {
        int[] freq=new int[26];
        int maxCount=0;
        char maxChar='a';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>maxCount){
                maxCount=freq[i];
                maxChar=(char)(i + 'a');
            }else if(freq[i]==maxCount){
                maxChar=(char) Math.min(maxChar, i+'a');
            }
        }
        return maxChar;
    }
}