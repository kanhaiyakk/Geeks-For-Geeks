//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            Solution ob = new Solution();
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    ch=(char)(122-(int)ch+97);
                    
                }
                else if(Character.isUpperCase(ch)){
                    ch=(char)(90-(int)ch+65);
                    
                }
            }
            sb.append(ch);
            
        }
        return sb.toString();
    }
}