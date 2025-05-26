// User function Template for Java

class Solution {
    static int Search(int array[], int target) {
        // code here
         int low=0;
        int high=array.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(array[mid]==target) return mid;
            
            if(array[low]<=array[mid]){
                if(array[low]<=target && target<=array[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(array[mid]<=target && target<=array[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
