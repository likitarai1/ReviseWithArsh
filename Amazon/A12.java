static void printString(int n)
{
    int []arr = new int[10000];
    int i = 0;

    // Step 1: Converting to number 
    // assuming 0 in number system
    while (n > 0)
    {
        arr[i] = n % 26;
        n = n / 26;
        i++;
    }

    // Step 2: Getting rid of 0, as 0 is
    // not part of number system
    for(int j = 0; j < i - 1; j++)
    {
        if (arr[j] <= 0)
        {
            arr[j] += 26;
            arr[j + 1] = arr[j + 1] - 1;
        }
    }

    for(int j = i; j >= 0; j--)
    {
        if (arr[j] > 0)
            System.out.print(
                (char)('A' + arr[j] - 1));
    }
    System.out.println();
}