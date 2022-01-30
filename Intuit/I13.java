class Solution {
    public int minSwaps(int[][] grid) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = grid.length;
        int swaps = 0;
        
        for(int i=0;i<n;i++){
            int zerosAtEnd = 0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==1){
                    break;
                }
                else{
                    zerosAtEnd++;
                }
            }
            al.add(zerosAtEnd);
        }
        
        for(int i=0;i<n;i++){
            int zerosNeeded = n-i-1;
            for(int j=i;j<al.size();j++){
                if(al.get(j)>=zerosNeeded){
                    swaps += j - i;
                    al.add(0, al.get(j));
                    al.remove(j+1);
                    break;
                }
                
                if(j==n-1){
                    return -1;
                }
            }
        }
        
        return swaps;
    }
}

// TC = O(N^2)
// SC = O(N)