class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=n-1;i>=0;i--){
            if(st.empty()){
                st.push(arr[i]);
                ans.add(arr[i]);
            }
            else{
                if(!st.empty() && arr[i]<st.peek()){
                    continue;
                }
                
                while(!st.empty() && st.peek()<=arr[i]){
                    st.pop();
                }
                
                if(st.empty()){
                    st.push(arr[i]);
                    ans.add(arr[i]);
                }
            }
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}

// TC = O(N)
// SC = O(N)