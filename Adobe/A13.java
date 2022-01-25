static int checkArray(int a[], int b[], int n)
    {
        int operations = 0;
        int i = 0;
         
        while (i < n) {
             
            if (a[i] - b[i] == 0) {
                i++;
                continue;
            }
     
            int diff = a[i] - b[i];
            i++;
     
            while (i < n &&
               a[i] - b[i] == diff) {
                i++;
            }
     
            operations++;
        }
        return operations;
    }

//TC = O(N)
//SC = O(1)