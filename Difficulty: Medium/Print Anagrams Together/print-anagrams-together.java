class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, ArrayList<String>> map=new HashMap<>();
        for(String word:arr){
            char[] chArr=word.toCharArray();
            Arrays.sort(chArr);
            String key=new String(chArr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
