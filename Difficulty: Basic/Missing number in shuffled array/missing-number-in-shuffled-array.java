//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            ArrayList<Integer> array1 = new ArrayList<>();
            ArrayList<Integer> array2 = new ArrayList<>();

            String line = read.readLine().trim(); // Read the first array
            if (!line.isEmpty()) {                // Check if the line is not empty
                String[] tokens = line.split(" ");
                for (String token : tokens) {
                    array1.add(Integer.parseInt(token));
                }
            }

            line = read.readLine().trim(); // Read the second array
            if (!line.isEmpty()) {         // Check if the line is not empty
                String[] tokens = line.split(" ");
                for (String token : tokens) {
                    array2.add(Integer.parseInt(token));
                }
            }

            // Convert ArrayList to arrays for processing
            int[] arr1 = new int[array1.size()];
            for (int i = 0; i < array1.size(); i++) {
                arr1[i] = array1.get(i);
            }

            int[] arr2 = new int[array2.size()];
            for (int i = 0; i < array2.size(); i++) {
                arr2[i] = array2.get(i);
            }

            Solution solution = new Solution();
            int res = solution.findMissing(arr1, arr2);

            System.out.println(res); // New line after each test case output

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public int findMissing(int[] arr1, int[] arr2) {
        // code here
       
       
        int sum1=0;
        int sum2=0;
        for(int num:arr1){
            sum1+=num;
        }
        for(int num:arr2){
            sum2+=num;
        }
        int res=Math.abs(sum1-sum2);
        return res;
        
        
        
        
        // Set<Integer> set=new HashSet<>();
        // for(int num: arr1){
        //     set.add(num);
        // }
        // for(int nums: arr2){
        //       set.remove(nums);
        // }
        // if(!set.isEmpty()){
        //     return set.iterator().next();
        // }
        // return -1;
    }
}