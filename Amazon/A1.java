// 845. Longest Mountain in Array

class Solution {
    public int longestMountain(int[] arr) {
        int N = arr.length;
        int ans = 0, base = 0;
        while (base < N) {
            int end = base;
          
            if (end + 1 < N && arr[end] < arr[end + 1]) {
                
                while (end + 1 < N && arr[end] < arr[end + 1]) end++;
                
                if (end + 1 < N && arr[end] > arr[end + 1]) {
                    while (end + 1 < N && arr[end] > arr[end + 1]) end++;
                    ans = Math.max(ans, end - base + 1);
                }
            }

            base = Math.max(end, base + 1);
        }

        return ans;
    }
}

// TC = O(N)
// SC = O(1)