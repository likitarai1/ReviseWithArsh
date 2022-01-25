class Solution {
    
    public int winner(int[] nums,int i,int j,int[][] dp){
        if(i==j){
            return nums[i];
        }
        
        if(i>j){
            return 0;
        }
        
        // if(dp[i][j]!=-1){
        //     return dp[i][j];
        // }
        
        //X
        int way1 = nums[i] + Math.min(winner(nums,i+2,j,dp),winner(nums,i+1,j-1,dp));
        
        int way2 = nums[j] + Math.min(winner(nums,i,j-2,dp),winner(nums,i+1,j-1,dp));
        
        dp[i][j] = Math.max(way1,way2);
        
        return dp[i][j];
    }
    
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int total = 0;
        int[][] dp = new int[n][n];
        // Arrays.fill(dp,-1);
        
        for(int num : nums){
            total += num;
        }
        
        int ans1 = winner(nums,0,n-1,dp);
        int ans2 = total - ans1;
        
        if(ans2>ans1){
            return false;
        }
        
        return true;
    }
}

//TC=O(N^2)
//SC=O(N^2)