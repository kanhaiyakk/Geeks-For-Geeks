// User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        // code here
        StringBuilder sb=new StringBuilder();
        String[] words=S.split(" ");
        for(String word:words){
            sb.append(word.charAt(0));
        }
        return sb.toString();
    }
};