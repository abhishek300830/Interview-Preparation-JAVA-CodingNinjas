import java.util.Scanner;

public class BinaryTreeUse {
    // take input from user
    public static BinaryTreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        System.out.print("Enter Left Child of Tree : ");
        BinaryTreeNode<Integer> leftChild = takeInput();
        System.out.print("Enter Right Child of Tree : ");
        BinaryTreeNode<Integer> rightChild = takeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    // detailed print function
    public static void printTreeDetailed(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + ": ");
        if (node.left != null) {
            System.out.print(node.left.data + ",");
        }
        if (node.right != null) {
            System.out.print(node.right.data);
        }
        System.out.println();
        printTreeDetailed(node.left);
        printTreeDetailed(node.right);
    }

    public static void printTree(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        printTree(node.left);
        printTree(node.right);
    }

    public static void main(String[] args) {

        // Creating Binary Tree with root data = 1
        // BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(1);
        // BinaryTreeNode<Integer> treeLeft = new BinaryTreeNode<>(2);
        // BinaryTreeNode<Integer> treeRight = new BinaryTreeNode<>(3);

        // tree.left = treeLeft;
        // tree.right = treeRight;

        // BinaryTreeNode<Integer> AnotherLeft = new BinaryTreeNode<>(4);
        // BinaryTreeNode<Integer> AnotherRight = new BinaryTreeNode<>(5);
        // BinaryTreeNode<Integer> Node = new BinaryTreeNode<>(6);

        // treeLeft.left = AnotherLeft;
        // treeRight.right = AnotherRight;
        // treeRight.left = Node;

        BinaryTreeNode<Integer> tree = takeInput();

        // printing Elements of Tree
        printTree(tree);
        System.out.println("Detailed Tree Structure");
        printTreeDetailed(tree);

    }
}
// start from tree recursion in codezen