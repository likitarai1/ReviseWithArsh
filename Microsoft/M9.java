class Tree
{
    int count = 0;
    
    int countSubtreeSum(Node root, int x){
        if(root==null){
            return 0;
        }
        
        int left=countSubtreeSum(root.left,x);
        int right=countSubtreeSum(root.right,x);
        
        if(left+right+root.data==x){
            count++;
        }
        
        return left+right+root.data;
    }
    
    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int X)
    {
        if(root==null){
            return 0;
        }
        
        int left = countSubtreeSum(root.left, X);
        int right = countSubtreeSum(root.right, X);
        
        if(left+right+root.data == X){
            return ++count;
        }
        
        return count;
    }
}

// TC = O(N)
// SC = O(H)