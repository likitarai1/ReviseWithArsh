class Solution {
    
    List<List<Integer>> adj;
    HashMap<Integer, Integer> rank;
    Map<Pair<Integer, Integer>, Boolean> connDict;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> ans = new ArrayList<>();
        
        adj = new ArrayList<>();
        rank = new HashMap<Integer, Integer>();
        
       
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
            rank.put(i,null);
        }
        
        formGraph(n, connections);
        dfs(0,0);
        
        for(Pair<Integer, Integer> criticalConnec : connDict.keySet()){
            ans.add(new ArrayList<Integer>(Arrays.asList(criticalConnec.getKey(),criticalConnec.getValue())));
        }
        
        return ans;
    }
    
    public int dfs(int node, int discoveryRank){
        if(rank.get(node)!=null){
            return rank.get(node);
        }
        
        rank.put(node, discoveryRank);
        
        int minRank = discoveryRank+1;
        
        for(Integer neighbour : adj.get(node)){
            Integer nRank = rank.get(neighbour);
            
            if(nRank!=null && nRank==discoveryRank-1){
                continue;
            }
            
            int recurRank = dfs(neighbour, discoveryRank+1);
            
            if(recurRank<=discoveryRank){
                int sortedU = Math.min(node, neighbour), sortedV = Math.max(node, neighbour);
                connDict.remove(new Pair<Integer, Integer>(sortedU,sortedV));
            }
            
            minRank = Math.min(minRank, recurRank);
        }
        
        return minRank;
    }
    
    public void formGraph(int n, List<List<Integer>> connections){
        
        connDict = new HashMap<Pair<Integer,Integer>, Boolean>();
        
        for(List<Integer> edge : connections){
            int u = edge.get(0);
            int v = edge.get(1);
            
            adj.get(u).add(v);
            adj.get(v).add(u);
            
            int sortedU = Math.min(u,v), sortedV = Math.max(u,v);
            connDict.put(new Pair<Integer, Integer>(sortedU,sortedV), true);
        }
    }
}

// TC = O(V+E)
// SC = O(E)