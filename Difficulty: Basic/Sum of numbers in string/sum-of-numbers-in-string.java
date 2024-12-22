//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    
System.out.println("~");
}
		
	}
}

// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
       int sum=0;
       String temp="";
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
               temp+=ch; 
            }else{
            if(!temp.isEmpty()){
                sum += Integer.parseInt(temp);
                temp="";
            }}
        }
        if(!temp.isEmpty()){
            sum+=Integer.parseInt(temp);
        }
        return sum;
        
    }
    
}