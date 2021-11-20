package Tree;

class BinaryTree {
    // Root of Binary Tree
    public Node root;

    //method insert
    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.insert(value);
        }
    }

    BinaryTree() {
        root = null;
    }

    /* Given a binary tree, print its nodes in inorder*/
    public void printInOrder(Node node) {
        if (node.left != null) {
            node.left.printInOrder();
        }
        System.out.print(node.data + " ");
        if (node.right != null) {
            node.right.printInOrder();
        }
    }
    public void printPreOrder(Node node) {
        System.out.print(node.data + " ");
        if (node.left != null) {
            node.left.printPreOrder();
        }
        if (node.right != null) {
            node.right.printPreOrder ();
        }
    }
    public void printPostOrder(Node node) {

        if (node.left != null) {
            node.left.printPostOrder();
        }
        if (node.right != null) {
            node.right.printPostOrder ();
        }
        System.out.print(node.data + " ");
    }
    public void DepthFirstSearch(int value, Node node) {
        if (node.data != value) {
            System.out.print(node.data + " ");
        }
        if (node.left != null) {
            node.left.DepthFirstSearch (value);
        }
        if (node.right != null) {
            node.right.DepthFirstSearch (value);
        }
    }
}

