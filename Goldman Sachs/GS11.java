class Solve {
    int[] findTwoElement(int arr[], int size) {
        int i;
        int[] ans = new int[2];

        for (i = 0; i < size; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                ans[0] = abs_val;
        }

        // System.out.print("And the missing element is ");
        for (i = 0; i < size; i++) {
            if (arr[i] > 0)
                ans[1] = i+1;
        }
        
        return ans;
    }
}

// TC = O(N)
// SC = O(1)