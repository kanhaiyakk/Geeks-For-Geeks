//{ Driver Code Starts
import java.util.*;

// Main class to handle input/output
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String[] input1 = sc.nextLine().split(" ");
            int[] arr = new int[input1.length];
            for (int i = 0; i < input1.length; i++) {
                arr[i] = Integer.parseInt(input1[i]);
            }

            String[] input2 = sc.nextLine().split(" ");
            int[] brr = new int[input2.length];
            for (int i = 0; i < input2.length; i++) {
                brr[i] = Integer.parseInt(input2[i]);
            }

            Solution ob = new Solution();
            int[] res = ob.mergeNsort(arr, brr);

            // Printing the result
            for (int num : res) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] mergeNsort(int[] arr, int[] brr) {
        ArrayList<Integer> mergeList= new ArrayList<>();
        for(int num : arr){
            mergeList.add(num);
        }
        for(int kk : brr){
            mergeList.add(kk);
        }
        
        Set<Integer> uniqueList=new TreeSet<>(mergeList);
        int[] result= new int[uniqueList.size()];
        int i=0;
        for(int ss : uniqueList){
            result[i++]=ss;
        }
        return result;
        
    }
}
