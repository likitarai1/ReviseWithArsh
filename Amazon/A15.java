class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        Node curr = head, t;
        
        while(curr!=null){
            
            while(int count=1;count<M && curr!=null;count++){
                curr = curr.next;
            }
            
            if(curr==null){return;}
            
            t=curr.next;
            
            while(int count=1;count<=N && t!=null;count++){
                // Node temp=t;
                t=t.next;
            }
            
            curr.next=t;
            curr=t;
        }
    }
}

//TC=O(N)
//SC=O(1)