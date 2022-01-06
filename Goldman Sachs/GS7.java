class Solution {
    static int findPosition(int N , int M , int K) {
        if(M <= N-K+1){
            return M+K-1;
        }
        
        M = M - (N-K+1);
        
        return (M%N == 0) ? N : M%N;
    }
};

// TC = O(1)
// SC = O(1)