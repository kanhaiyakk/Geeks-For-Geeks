// User function Template for Java

class Solution {

    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> result=new ArrayList<>();
        if(n%2!=0) return result;
        int max=n/2;
        backtracking(result,"",0,0,max);
        return result;
    }
    public void backtracking(ArrayList<String> result, String curr,int open,int close,int max){
        if(curr.length()==max*2){
            result.add(curr);
        }
        if(open<max){
            backtracking(result,curr+"(", open+1,close,max);
        }
        if(close<open){
            backtracking(result,curr+")",open,close+1,max);
        }
    }
}