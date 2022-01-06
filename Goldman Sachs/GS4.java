class GfG
 {
	String encode(String str)
	{
          String ans = "";
          char[] s = str.toCharArray();
          int n = str.length();
          for(int i=0; i<n; i++){
              ans += s[i];
              int cnt = 1;
              while(i+1<n && s[i]==s[i+1]){
                  cnt++;
                  i++;
              }
              
              ans += String.valueOf(cnt);
          }
          
          return ans;
	}
	
 }

// TC = O(N)
// SC = O(N)