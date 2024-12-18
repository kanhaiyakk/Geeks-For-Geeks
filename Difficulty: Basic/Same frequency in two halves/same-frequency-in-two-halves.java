//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            if (ob.passed(s)==true)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    boolean passed(String s)
    {
        // your code here
        int mid=s.length()/2;
        String word1, word2;
        if(s.length() % 2==0){
         word1=s.substring(0,mid);
         word2=s.substring(mid);
        }else{
         word1=s.substring(0,mid);
         word2=s.substring(mid+1);
        }
        if(word1.length() != word2.length()){
            return false;
        }
        int[] count=new int[26];
        for(int i=0;i<word1.length();i++){
            count[word1.charAt(i)-'a']++;
            count[word2.charAt(i)-'a']--;
        }
        for(int freq:count){
            if(freq != 0){
                return false;
            }
        }
        return true;
    }
}