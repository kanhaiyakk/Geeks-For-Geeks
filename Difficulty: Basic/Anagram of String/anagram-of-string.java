//{ Driver Code Starts
//saksham raj seth
import java.util.*;
import java.util.stream.*;

class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s,String s1)
        {
       int[] freq=new int[26];
       for(char ch : s.toCharArray()){
           freq[ch - 'a']++;
       }
       for(char ch1 : s1.toCharArray()){
           freq[ch1 - 'a']--;
       }
       
       int deletion=0;
       for(int count : freq){
           deletion += Math.abs(count);
       }
        return deletion;
        
        }
}