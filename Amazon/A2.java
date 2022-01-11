class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<k;i++){
            maxh.add(arr[i]);
        }
        
        ans.add(maxh.peek());
        
        maxh.remove(arr[0]);
        
        for(int i=k;i<n;i++){
            maxh.add(arr[i]);
            ans.add(maxh.peek());
            maxh.remove(arr[i-k+1]);
        }
        
        return ans;
    }
}

// TC = O(NlogK)
// SC = O(K)