class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        int n = nums.length;
        
        int low=0, high=n-1;
        
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                low=j+1;
                high=n-1;
                int NewTarget = target - nums[i] - nums[j];
                
                while(low<high){
                    int sum = nums[low]+nums[high];
                    if(sum<NewTarget){
                        low++;
                        while(low<high && nums[low]==nums[low-1]){
                            low++;
                        }
                    }
                    else if(sum>NewTarget){
                        high--;
                        while(high>low && nums[high]==nums[high+1]){
                            high--;
                        }
                    }
                    else{
                        res.add(Arrays.asList(nums[i],nums[j],nums[low++],nums[high--]));
                        while(low<high && nums[low]==nums[low-1]){
                            low++;
                        }

                        while(high>low && nums[high]==nums[high+1]){
                            high--;
                        }
                    }
                    
                    
                }
                
                while(j+1<n && nums[j]==nums[j+1]){
                    j++;
                }
            }
            
            while(i+1<n && nums[i]==nums[i+1]){
                i++;
            }
        }
        
        return res;
    }
}

// TC = O(N^k-1)
// SC = O(1)