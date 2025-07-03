// User function Template for Java

class Solution {
    int sum(int a, int b) {
        // code here
        while(b!=0){
            int carry=(a&b) << 1;
            a=a^b;
            b=carry;
        }
        return a;
    }
}