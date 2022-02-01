class Solution {
    int m, n, len;
    public boolean dfs(int r, int c, int start, String word, char[][] board){
        
        if(r>=m || r<0 || c<0 || c>=n){
            return false;
        }
        
        if(start==len-1 && board[r][c]==word.charAt(start)){
            return true;
        }
        
        if(word.charAt(start)!=board[r][c]){
            return false;
        }
        
        boolean ans = false;
        board[r][c] = '#';
        ans = dfs(r-1,c,start+1,word,board) || dfs(r,c+1,start+1,word,board) || dfs(r+1,c,start+1,word,board) || dfs(r,c-1,start+1,word,board);
        board[r][c] = word.charAt(start); //backtrack
        return ans;
    }
    
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        
        len = word.length();
        int start = 0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(i, j, start, word, board)){
                    return true;
                }
            }
        }
        
        return false;
    }
}

// TC = O(N*3^L)
// SC = O(L)