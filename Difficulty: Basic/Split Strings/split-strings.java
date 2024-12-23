//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        
System.out.println("~");
}
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb3=new StringBuilder();
        for(char ch:S.toCharArray()){
            if(Character.isLetter(ch)){
                sb1.append(ch);
            }else if(Character.isDigit(ch)){
                sb2.append(ch);
            }else{
                sb3.append(ch);
            }
        }
        ArrayList<String> strList=new ArrayList<>();
        if(sb1.length()>0){
        strList.add(sb1.toString());
        }else{
            strList.add("-1");
        }
        
        if(sb2.length()>0){
        strList.add(sb2.toString());
        }else{
            strList.add("-1");
        }
        if(sb3.length()>0){
        strList.add(sb3.toString());
        }else{
            strList.add("-1");
        }
        return strList;
        
    }
} 
