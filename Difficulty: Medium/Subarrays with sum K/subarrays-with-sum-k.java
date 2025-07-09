class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n=arr.length;
        int count=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int curr=sum-k;
            if(map.containsKey(curr)){
                count+=map.get(curr);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum+=arr[j];
        //         if(sum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}