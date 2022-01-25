class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i=0;
        int j = i+1;
        int sum = arr[i];
        
        while(i<j && j<=n){
            
            if(sum > s){
                while(sum>s && i<j){
                    sum -= arr[i];
                    i++;
                }
            }
            
            if(sum == s){
                ans.add(i+1);
                ans.add(j);
                return ans;
            }
            
            if(j<n){
                sum += arr[j];
            }
            
            j++;
        }
        ans.add(-1);
        return ans;
    }
}

// TC = O(N)
// SC = O(1)