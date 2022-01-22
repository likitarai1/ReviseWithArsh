class Solution
{
    //Function to find unit area of the largest region of 1s.
    int count = 0;
    int row, col;
    
    void dfs(int[][] grid, int r, int c){
        if(r<0 || r>=row || c<0 || c>=col || grid[r][c]==0 || grid[r][c]==2){
            return;
        }
        
        grid[r][c] = 2;
        count++;
        
        int[] rN = {-1,-1,-1,0,1,1,1,0};
        int[] cN = {-1,0,1,1,1,0,-1,-1};
        
        for(int k=0;k<8;k++){
            dfs(grid,r+rN[k],c+cN[k]);
        }
    }
    
    public int findMaxArea(int[][] grid)
    {
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int result = 0;
        
        row = grid.length;
        col = grid[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                count = 0;
                if(grid[i][j]==1){
                    dfs(grid, i, j);
                    result = Math.max(count,result);
                }
            }
        }
        
        return result;
    }
}