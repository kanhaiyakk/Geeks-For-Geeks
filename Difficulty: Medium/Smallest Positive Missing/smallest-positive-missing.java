class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        boolean[] present=new boolean[n+1];
        for(int num:arr){
            if(num>0 && num<=n){
                present[num]=true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!present[i]){
                return i;
            }
        }
        return n+1;
    }
}
