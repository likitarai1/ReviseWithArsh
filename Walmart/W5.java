class Solution
{

    public static void preorder(Node root)
    {
        if (root == null) {
            return;
        }
 
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
 
    public static int transform(Node root)
    {

        if (root == null) {
            return 0;
        }
 

        int left = transform(root.left);
        int right = transform(root.right);
 

        int old = root.data;

        root.data = left + right;
 
   
        return root.data + old;
    }
 
}