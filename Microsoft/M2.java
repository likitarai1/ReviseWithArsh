class Solution {
    public boolean canFinish(int n, int[][] pre) {
        ArrayList<Integer>[] adj = new ArrayList[n];
        int[] outdeg = new int[n];
        ArrayList<Integer> bfs = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }
        
        for(int[] i: pre){
            adj[i[1]].add(i[0]);
            outdeg[i[0]]++;
        }
        
        for(int i=0;i<n;i++){
            if(outdeg[i] == 0){
                bfs.add(i);
            }
        }
        
        for(int i=0;i<bfs.size();i++){
            for(int j: adj[bfs.get(i)]){
                if(--outdeg[j]==0){
                    bfs.add(j);
                }
            }
        }
        
        return bfs.size() == n;
    }
}

// TC = O(E+V)
// SC = O(E+V)

