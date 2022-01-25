class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        Map<String, Integer> map = new HashMap<>();
        String[] ans = new String[2];
        
        for(String name : arr){
            if(map.keySet().contains(name)){
                map.put(name, map.get(name) + 1);
            }
            else{
                map.put(name, 1);
            }
        }
        
        int maxVal = 0;
        String winner = "";
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key  = entry.getKey();
            Integer val = entry.getValue();
            
            if (val > maxVal)
            {
                maxVal = val;
                winner = key;
            }
            else if(val == maxVal && winner.compareTo(key)>0){
                winner = key;
            }
        }
        
        ans[0] = winner;
        ans[1] = String.valueOf(maxVal);
        
        
        return ans;
    }
}