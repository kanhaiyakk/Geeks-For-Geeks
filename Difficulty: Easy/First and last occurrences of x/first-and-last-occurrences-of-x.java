//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

            String inputLine1[] = br.readLine().trim().split(" ");
            int n = inputLine1.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(x, arr);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        int first=-1;
        int last=-1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                }
               last=i;
            }
        }
        if(first==-1){
            list.add(-1);
        }else{
            list.add(first);
            list.add(last);
        }
       
        return list;
    }
}
