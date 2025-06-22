class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> list=new ArrayList<>();
        Set<Integer> seen=new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                list.add(num);
            }
        }
        return list;
    }
}