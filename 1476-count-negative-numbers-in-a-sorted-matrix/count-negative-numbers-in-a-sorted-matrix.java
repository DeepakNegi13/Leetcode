class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i =0; i < grid.length; i++){
            if(grid[i][0]<0){
                count += (grid.length-i)*grid[0].length;
                break;
            } 
            for(int j = grid[0].length-1; j>=0; j--){
                if(grid[i][j]<0) count++;
                else break;
            }
            
        }
        return count;
    }
}