class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        if (n == 0)
        return 0;
        if (n == 1)
            return arr[0];
        if (n == 2)
            return Math.max(arr[0], arr[1]);

        int val1=arr[0], val2=Math.max(arr[0], arr[1]), val3=0;
        
        for(int i=2;i<n;i++){
            val3 = Math.max(val2, arr[i]+val1);
            val1=val2;
            val2=val3;
        }
        
        return val2;
    }
}

// TC = O(N)
// SC = O(1)