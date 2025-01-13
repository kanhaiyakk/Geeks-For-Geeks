//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
        int result=0;
        String str=Integer.toString(num);
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='0'){
                ch='5';
                
            }
            sb.append(ch);
           
        }
         return Integer.parseInt(sb.toString());
        
    }
}