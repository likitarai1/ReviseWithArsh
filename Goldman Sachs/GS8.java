// 91. Decode Ways

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(s.charAt(0) == '0' || n==0){
            return 0;
        }
        
        int prevToprev = 1, prev = 1;
        
        for(int i=1;i<n;i++){
            int count = 0;
            if(s.charAt(i) != '0'){
                count = prev;
            }
            
            int dd = Integer.parseInt(s.substring(i-1,i+1));
            
            if(dd>=10 && dd<=26){
                count += prevToprev;
            }
            
            prevToprev = prev;
            prev = count;
        }
        
        return prev;
    }
}

// TC = O(N)
// SC = O(1)