class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int n = s.length();
        boolean negative = false; 
        
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                ans = ans*10 + (s.charAt(i) - '0');
            }
            else if(s.charAt(i) == '-' && Character.isDigit(s.charAt(i+1))){
                negative = true;
            }
        }
        
        if(negative){
            ans = -ans;
        }
        
        return ans;
    }
}

//TC=O(N)
//SC=O(1)