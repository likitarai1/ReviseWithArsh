class Solution{
    static String printMinNumberForPattern(String s){
        int cur = 1;
        int D = 0 , i = 0;
        int n = s.length();
        String ans = "";
        
        while(i<n){
            if(i==0 && s.charAt(i) == 'I'){
                ans += String.valueOf(cur);
                cur++;
            }
            
            if(s.charAt(i) == 'D'){
                D++;
            }
            
            int j = i+1;
            while(j<n && s.charAt(j)=='D'){
                D++;
                j++;
            }
            
            int k = D;
            while(D>=0){
                ans += String.valueOf((cur + D));
                D--;
            }
            
            cur += k+1;
            D = 0;
            
            i = j;
        }
        return ans;
    }
}

// TC = O(N)
// SC = O(1)