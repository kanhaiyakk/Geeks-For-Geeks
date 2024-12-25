//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Arrays;

public class Driver {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            boolean a = obj.areIsomorphic(s1, s2);
            if (a)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        // Your code here
        int[] ss=new int[256];
        int[] tt=new int[256];
        int len=s1.length();
        for(int i=0;i<len;i++){
            if(ss[s1.charAt(i)] != tt[s2.charAt(i)]){
                return false;
            }
                ss[s1.charAt(i)]=i+1;
                tt[s2.charAt(i)]=i+1;
            
        }
        return true;
    }
}