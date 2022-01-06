// 49. Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        int[] count = new int[26];
        for(String s : strs){
            
            Arrays.fill(count, 0);
            char[] chars = s.toCharArray();
            
            for(char c : chars){
                count[c - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder("");
            
            for(int i=0;i<26;i++){
                sb.append(count[i]);
                sb.append('#');
            }
            
            String key = sb.toString();
    
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
            
        }
        
        return new ArrayList<>(groups.values());
    }
}

// TC = O(NK)
// SC = O(NK)