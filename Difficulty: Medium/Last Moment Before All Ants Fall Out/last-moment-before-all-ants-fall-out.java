class Solution {
    public int getLastMoment(int n, int left[], int right[]) {
        // code here
        int maxTime=0;
        for(int num:left){
            maxTime=Math.max(maxTime,num);
        }
        for(int num:right){
            maxTime=Math.max(maxTime,n-num);
        }
        return maxTime;
    }
}