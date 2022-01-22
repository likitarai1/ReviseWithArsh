class solve{
    
    //Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N)
    {
        
        ArrayList<String> ans = new ArrayList<>();
        
        if(N==0){
            ans.add("0");
            return ans;
        }
        
        Queue<String> q = new LinkedList<>();
        
        q.add("1");
        
        while(N-- > 0){
            String temp = q.poll();
            ans.add(temp);
            q.add(temp+"0");
            q.add(temp+"1");
        }
        
        return ans;
    }
    
}