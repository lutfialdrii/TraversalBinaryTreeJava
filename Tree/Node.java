package Tree;

class Node {
    public int data;
    public Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
    public void insert(int value){
        if (value == this.data) {
            //Skip
        } else if (value < this.data){
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value); //rekursif
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value); //rekursif
            }
        }
    }
    public void printInOrder(){
        if (this.left != null){
            this.left.printInOrder();
        }
        System.out.print(this.data + " ");
        if (this.right != null){
            this.right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.print(this.data + " ");
        if (this.left != null) {
            this.left.printPreOrder();
        }
        if (this.right != null) {
            this.right.printPreOrder ();
        }
    }
    public void printPostOrder() {

        if (this.left != null) {
            this.left.printPostOrder();
        }
        if (this.right != null) {
            this.right.printPostOrder ();
        }
        System.out.print(this.data + " ");
    }
    public void DepthFirstSearch(int value) {
        System.out.print(this.data + " ");
        if (this.data == value) {
            System.out.println(" Angka " + value + "ditemukan");
            System.exit(0);
        }
        if (this.left != null) {
            this.left.DepthFirstSearch (value);
        }
        if (this.right != null) {
            this.right.DepthFirstSearch (value);
        }
    }
}
