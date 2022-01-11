class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
       HashMap<Character, Integer> hash = new HashMap<>();
       Arrays.sort(bolts);
    // creating a hashmap for nuts
    for (int i = 0; i < n; i++)
      hash.put(nuts[i], i);
 
    // searching for nuts for each bolt in hash map
    for (int i = 0; i < n; i++)
      if (hash.containsKey(bolts[i]))
        nuts[i] = bolts[i];
    }
}

// TC = O(NlogN)
// SC = O(N)