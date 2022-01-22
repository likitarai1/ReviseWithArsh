class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int m = 0; // row
        int n = 0; // col
        int i;
            
        while(m<r && n<c){
            for(i=n;i<c;i++){
                ans.add(matrix[m][i]);
            }
            m++;
            
            for(i=m;i<r;i++){
                ans.add(matrix[i][c-1]);
            }
            c--;
            
            if(m<r){
                for(i=c-1;i>=n;i--){
                    ans.add(matrix[r-1][i]);
                }
                r--;
            }
            
            if(n<c){
                for(i=r-1;i>=m;i--){
                    ans.add(matrix[i][n]);
                }
                n++;
            }
        }
         
        
        return ans;
    }
}

// TC = O(M*N)
// SC = O(1)