package PostOrderInBST;

class BST {
    private TreeNode root;

    public BST() {
        this.root = null;
    }

    // Method to insert a new node with given value into BST
    public void insert(int val) {
        root = insertRec(root, val);
    }

    // A recursive function to insert a new value into BST
    private TreeNode insertRec(TreeNode root, int val) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        // Otherwise, recur down the tree
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }

        // return the unchanged node pointer
        return root;
    }

    // Method to perform postorder traversal
    public void postorderTraversal() {
        postorderTraversalRec(root);
    }

    // A recursive function to do postorder traversal
    private void postorderTraversalRec(TreeNode root) {
        if (root != null) {
            postorderTraversalRec(root.left);    // Visit left subtree
            postorderTraversalRec(root.right);   // Visit right subtree
            System.out.print(root.val + " ");    // Visit root node
        }
    }
}

