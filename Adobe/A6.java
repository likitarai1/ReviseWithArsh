class Solution {
    
    List<String> ans;
    
    public List<String> parenthesis(int o, int c, String s){
            ans.add(s);
            return ans;
        }
        
        if(o==c){
            return parenthesis(o-1,c,s+'(');
        }
        else{
            
            if(o>0){
                parenthesis(o-1,c,s+'(');}
            
            if(c>0){
            parenthesis(o,c-1,s+')');}
            
        }
        
        return ans;
    }
    
    public List<String> generateParenthesis(int n) {
        int open=n, close=n;
        ans = new ArrayList<>();
        return parenthesis(open,close,"");
    }
}