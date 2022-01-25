class Solution {
    public int longestArithSeqLength(int[] nums) {
        
        int n = nums.length;
        
        if(n<=2){
            return n;
        }
        
        Map<Integer, Map<Integer, Integer>>dp = new HashMap<>();
        
        int ans = 2;
        
        for(int i=0;i<n;i++){
            dp.put(i, new HashMap<>());
            for(int j=0;j<i;j++){
                int diff = nums[j] - nums[i];
                int len = dp.get(j).getOrDefault(diff,1) + 1;
                if(len>ans){
                    ans = len;
                }
                dp.get(i).put(diff,len);
            }
        }
        
        return ans;
    }
}

// TC = O(N^2)
// SC = O(N)