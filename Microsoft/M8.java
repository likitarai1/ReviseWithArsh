class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                Node n = q.poll();
                
                if(i<size-1){
                    n.next = q.peek();
                }
                
                if(n.left != null){
                    q.add(n.left);
                }
                if(n.right != null){
                    q.add(n.right);
                }
            }
        }
        
        return root;
    }
}