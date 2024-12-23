//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        
System.out.println("~");
}
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        
       int countU=0;
        int countL=0;
         int countN=0;
          int countS=0;
       for(char ch:s.toCharArray()){
           if(Character.isUpperCase(ch)){
               countU++;
           }else if(Character.isLowerCase(ch)){
               countL++;
           }else if(Character.isDigit(ch)){
               countN++;
           }else{
               countS++;
           }
       }
       return new int[]{countU,countL,countN,countS};
    }
}