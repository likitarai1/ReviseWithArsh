// 1071. Greatest Common Divisor of Strings

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) { // str1 should be smaller than str2
            return gcdOfStrings(str2, str1); 
        }else if (!str1.startsWith(str2)) { // str2 is not prefix of str1
            return ""; 
        }else if (str2.isEmpty()) { // gcd string found
            return str1;
        }else { // cut common prefix part of str1
            return gcdOfStrings(str1.substring(str2.length()), str2); 
        }
    }
}

// TC = O(N)
// SC = O(1)