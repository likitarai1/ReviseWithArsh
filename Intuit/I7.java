class Solution {
    public int shipWithinDays(int[] wts, int days) {
        int low = 0, high = 0;
        
        for(int w: wts){
            low = Math.max(low, w);
            high += w;
        }
        
        while(low<high){
            int mid = low + (high-low)/2;
            int reqDays = 1, curWt = 0;
            
            for(int w: wts){
                if(curWt + w >mid){
                    reqDays++;
                    curWt = 0;
                }
                curWt += w;
            }
            
            if(reqDays > days){ // capacity is too less
                low = mid + 1;
            }
            else{ // posibility of still smaller capacity
                high = mid;
            }
        }
        
        return low;
    }
}

//TC = O(NlogN)
//SC = O(1)