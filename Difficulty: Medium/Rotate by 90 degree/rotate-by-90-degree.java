// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int j,l;
            for(j=0, l=n-1;j<l;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][l];
                mat[i][l]=temp;
                l--;
            }
        }
        
        
    }
}