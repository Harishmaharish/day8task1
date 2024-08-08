import java.util.*; 

// Step 1: Creating the tree node
class TreeNode {
    int value;
    TreeNode left, right;
    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

// Step 2: Class definition: TreeTraverse
public class TreeTraverse {
    public void postorder(TreeNode node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }
    
        public void preorder(TreeNode node) {
            if (node == null)
                return;
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
       
            public void inorder(TreeNode node) {
                if (node == null)
                    return;
                inorder(node.left);
                System.out.print(node.value + " ");
                inorder(node.right);
            }
    // Step 3: Main method
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left=new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(10);
        root.right.right.left = new TreeNode(9);
        TreeTraverse tree = new TreeTraverse();
        System.out.println("Postorder traversal:");
        tree.postorder(root);
        System.out.println();
        System.out.println("Preorder traversal:");
        tree.preorder(root);
        System.out.println();
        System.out.println("inorder traversal:");
        tree.inorder(root);
    }
}

