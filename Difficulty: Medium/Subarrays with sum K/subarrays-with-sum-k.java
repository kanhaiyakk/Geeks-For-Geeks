// User function Template for Java
class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        Map<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int num:arr){
            sum+=num;
            int curr=sum-k;
            if(map.containsKey(curr)){
                count+=map.get(curr);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}