public int minSwaps(int[][] grid) {
        int[] a = gridToVec(grid);
        return minSwaps(a);
    }
    
    private int minSwaps(int[] a) {
        int n = a.length;
        int ans = 0;
        for (int i=0; i<n; i++) {
            if (a[i] < (n-i-1)) {
                int j=i;
                while (j < n && a[j] < (n-i-1)) {
                    j++;
                }
				
                if (j == n) {     // Did not find any number greater than or equal to n-i-1.
                    return -1;  // so its impossible to get the answer.
                }
                while (j>i) {
                    //swap(a[j], a[j-1]);
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    ans++;
                    j--;
                }
            }
        }
        return ans;
    }
    
    
    private int zerosAtEnd(int[] a) {
        int ans = 0;
        int n = a.length;
        int i=n-1;
        while (i >= 0 && a[i] == 0) {
            ans++;
            i--;
        } 
        return ans;
    }
    
     private int[] gridToVec(int[][] grid) {
        int[] ans = new int[grid.length];
         int i =0;
        for (int[] x: grid) {
            ans[i++] = zerosAtEnd(x);
        }
        return ans;
    }