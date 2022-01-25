 class Solution{
    public String amendSentence(String s){
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        if(Character.isUpperCase(s.charAt(0))){
            int ascii = s.charAt(0);
            sb.append((char)(ascii+32));
        }else{
            sb.append(s.charAt(0));
        }
        
        for(int i=1;i<len;i++){
            if(Character.isUpperCase(s.charAt(i))){
                sb.append(" ");
                int ascii = s.charAt(i);
                sb.append((char)(ascii+32));
            }else{
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}

// TC = O(N)
// SC = O(1)