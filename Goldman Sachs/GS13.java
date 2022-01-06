class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStk = new Stack<>();
        Stack<StringBuilder> stringStk = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int k = 0;
        
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + ch - '0';
            }
            else if(ch == '['){
                countStk.push(k);
                stringStk.push(currStr);
                currStr = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder decodedStr = stringStk.pop();
                
                for(int i=countStk.pop(); i>0; i--){
                    decodedStr.append(currStr);
                }
                
                currStr = decodedStr;
            }
            else{
                currStr.append(ch);
            }
        }
        return currStr.toString();
    }
}