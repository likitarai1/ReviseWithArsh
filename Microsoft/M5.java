public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        
        ans[0] = 1;
        st.push(0);
        
        for(int i=1;i<n;i++){
            while(!st.empty() && price[st.peek()]<=price[i]){
                st.pop();
            }
            
            if(st.empty()){
                ans[i] = i+1;
            }
            else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        
        return ans;
    }


//TC = O(N)
//SC = O(N)