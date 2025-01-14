//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Long> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Long.parseLong(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (long i : array) arr[idx++] = (int)i;

            Solution obj = new Solution();

            // calling maxSubarraySum() function
            System.out.println(obj.thirdLargest(arr));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

  
class Solution {
    int thirdLargest(int arr[]) {
        
          // Your code here
        int n=arr.length;
        if(n<3){
            return -1;
        }
        Arrays.sort(arr);
        return arr[n-3];
    //   if (arr == null || arr.length < 3) return -1;

    //     // Initialize variables to track the largest elements
    //     Integer max1 = Integer.MIN_VALUE;
    //     Integer max2 = Integer.MIN_VALUE;
    //     Integer max3 = Integer.MIN_VALUE;

    //     // Traverse the array
    //     for (int num : arr) {
    //         if (num > max1) {
    //             max3 = max2;
    //             max2 = max1;
    //             max1 = num;
    //         } else if (num > max2 && num < max1) {
    //             max3 = max2;
    //             max2 = num;
    //         } else if (num > max3 && num < max2) {
    //             max3 = num;
    //         }
    //     }

    //     // If max3 was not updated from its initial value, return -1
    //     return max3 == Integer.MIN_VALUE ? -1 : max3;
    }
}
