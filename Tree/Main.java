package Tree;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        while (true) {
            System.out.println("\n1. Insert \n2. Pre Order Traversal \n3. In Order Traversal " +
                    "\n4. Post Order Traversal \n5. Depth First Search \n6. Exit ");
            System.out.print("Masukkan pilihan : ");

            int Menu = input.nextInt();
            switch ( Menu ) {
                //Jika input angka 1
                case 1:
                    System.out.print("\nSilahkan masukkan angka : ");
                    int value = input.nextInt();
                    tree.insert(value);
                    break;
                case 2:
                    System.out.println("\nPre Order :");
                    tree.printPreOrder(tree.root);
                    break;
                case 3:
                    System.out.println("\nInorder : ");
                    tree.printInOrder(tree.root);
                    break;
                case 4:
                    System.out.println("\nPost Order :");
                    tree.printPostOrder(tree.root);
                    break;
                case 5:
                    System.out.println("Silahkan masukkan angka yang ingin dicari : ");
                    int value1 = input.nextInt();
                    System.out.println("\nDepth First Search :");
                    tree.DepthFirstSearch(value1, tree.root);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}

