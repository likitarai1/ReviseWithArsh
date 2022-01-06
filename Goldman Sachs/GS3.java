// 713. Subarray Product Less Than K

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        int pro = 1;
        
        for(int i=0,j=0;j<n;j++){
            pro *= nums[j];
            
            while(i<=j && pro>=k){
                pro /= nums[i++]; // Remove starting integer of window
            }
            
            ans += j - i + 1;
        }
        
        return ans;
    }
}

// TC = O(N)
// SC = O(1)