
import java.util.*;
class Solution{

static String max;
static void findMaximumNum(char[] str,int k)
{
// Return if no swaps left
if (k == 0)
	return;

int n = str.length;

// Consider every digit
for (int i = 0; i < n - 1; i++)
{
	// Compare it with all digits
	// after it
	for (int j = i + 1; j < n; j++)
	{
	// if digit at position i
	// is less than digit
	// at position j, swap it
	// and check for maximum
	// number so far and recurse
	// for remaining swaps
	if (str[i] < str[j])
	{
		// swap str[i] with
		// str[j]
		char t = str[i];
		str[i] = str[j];
		str[j] = t;

		// If current num is more
		// than maximum so far
		if (String.valueOf(str).compareTo(max) > 0)
		max = String.valueOf(str);

		// recurse of the other
		// k - 1 swaps
		findMaximumNum(str, k - 1);

		// Backtrack
		char c = str[i];
		str[i] = str[j];
		str[j] = c;
	}
	}
}
}



