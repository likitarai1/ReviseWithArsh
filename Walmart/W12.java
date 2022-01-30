class Solution {
    public int[] recoverArray(int n, int[] sums) {
        Arrays.sort(sums);
        int m = sums.length;
        int[] res = new int[n], left = new int[m / 2], right = new int[m / 2];
        for (int i = 0; i < n; ++i) {
            int diff = sums[1] - sums[0], hasZero = 0, p = -1, q = -1, k = 0;
            for (int j = 0; j < m; ++j) {
                if (k <= q && right[k] == sums[j]) k++;
                else {
                    if (0 == sums[j]) hasZero = 1;
                    left[++p] = sums[j];
                    right[++q] = sums[j] + diff;
                }
            }
            if (1 == hasZero) {
                res[i] = diff;
                sums = left;
            } else {
                res[i] = -diff;
                sums = right;
            }
            m /= 2;
        }
        return res;
    }
}
Update 08/24
Thanks for @kcsquared's comment.
Here's the revised code.

class Solution {
    public int[] recoverArray(int n, int[] sums) {
        Arrays.sort(sums);
        int m = sums.length, zeroShift = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            int diff = sums[1] - sums[0], hasZero = 0, p = 0, k = 0, zpos = m;
            for (int j = 0; j < m; ++j) {
                if (k < p && sums[k] == sums[j]) k++;
                else {
                    if (zeroShift == sums[j]) zpos = p;
                    sums[p++] = sums[j] + diff;
                }
            }
            if (zpos >= m / 2) {
                res[i] = -diff;
            } else {
                res[i] = diff;
                zeroShift += diff;
            }
            m /= 2;
        }
        return res;
    }
}