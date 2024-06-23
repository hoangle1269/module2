package PostOrderInBST;

public class BSTTest {

    public static void main(String[] args) {
        // Create a BST instance
        BST bst = new BST();

        // Insert elements into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Perform postorder traversal and print the result
        System.out.println("Postorder traversal of BST:");
        bst.postorderTraversal();

        // Test edge cases or additional scenarios as needed
        // Example 1: Inserting a duplicate value (ignored in BST)
        bst.insert(30);
        System.out.println("\nPostorder traversal after inserting duplicate:");
        bst.postorderTraversal();

        // Example 2: Inserting new values after initial traversal
        bst.insert(55);
        bst.insert(75);
        System.out.println("\nPostorder traversal after inserting new values:");
        bst.postorderTraversal();
    }
}

