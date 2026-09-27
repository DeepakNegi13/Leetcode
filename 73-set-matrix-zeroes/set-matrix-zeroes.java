class Solution {
    public void zetZeroToRow(int i,int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int j = 0;j<m;j++){
            matrix[i][j] = 0;
        }
    }
    public void zetZeroToColumn(int j,int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            matrix[i][j] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
       
        int[] column = new int[m]; 
        int[] row = new int[n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    column[j] = 1;
                    row[i] = 1;
                }
            }
        }
        for(int i = 0;i<row.length;i++){
            if(row[i]==1){
                zetZeroToRow(i,matrix);
            }
        }
        for(int j = 0;j<column.length;j++){
            if(column[j]==1){
                zetZeroToColumn(j,matrix);
            }
        }
        
    }
}