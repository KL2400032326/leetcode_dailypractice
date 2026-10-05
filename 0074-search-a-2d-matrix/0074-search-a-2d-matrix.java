class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,n=matrix.length,m=matrix[0].length;
        int r=n*m-1;
     
        while(l<=r){
            int mid=(l+r)/2;
            int row=mid/m;
            int com=mid%m;
            if(matrix[row][com]==target){
                return true;
            }
            else if( target> matrix[row][com])
             l=mid+1;
            else
              r=mid-1;
        }
        
        return false;
    }
}