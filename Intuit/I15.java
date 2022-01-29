class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MIN_VALUE;
        
        for(int pile : piles){
            high = Math.max(high, pile);
        }
        
        while(low<high){
            int mid = low + (high - low)/2;
            int hrspent = 0;
            
            for(int pile : piles){
                hrspent += Math.ceil((double) pile / mid);
            }
            
            if(hrspent<=h){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        
        return low;
    }
}

// TC = O(nlogm)
// SC = O(1)