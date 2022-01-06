class Solution {
  public:
    long long squaresInChessBoard(long long N) {
        return (N*(N+1)*(2*N + 1))/6;
    }
};

// Forms pattern of sum of N squares 

// TC = O(1)
// SC = O(1)