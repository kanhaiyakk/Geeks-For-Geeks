// User function Template for Java

class Solution {
    public static int maxSubStr(String str) {
        // Write your code here
        int count_0=0;
        int count_1=0;
        int res=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                count_0++;
            }else{
                count_1++;
            }
            
            if(count_0 == count_1){
                res++;
                 count_0 = 0;
                count_1 = 0;
            }
        }
        if (count_0 != 0 || count_1 != 0) {
            return -1;
        }

        return (res == 0) ? -1 : res;
    }
}