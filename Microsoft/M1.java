class Solution {
    public int minimumDifference(int[] nums) {
        int range=0;
        int n = nums.length;
        
        for(int num : nums){
            range+=num;
        }
        
        int [][]dp = new int[n+1][(range/2)+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=range/2;j++){
                if(j<nums[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], nums[i-1]+dp[i-1][j-nums[i-1]]);
                }
            }
        }
        
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=range/2;i++){
            ans = Math.min(ans, range-(2*dp[n][i]));
        }
        
        return ans;
    }
}