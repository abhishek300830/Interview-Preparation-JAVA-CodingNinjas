import java.util.Scanner;

public class BinaryTreeUse {

    // 5. counting the No of Nodes in Tree
    public static int countNodes(BinaryTreeNode<Integer> node) {
        if (node == null) {
            return 0;
        }
        int leftCount = countNodes(node.left);
        int rightCount = countNodes(node.right);

        return 1 + leftCount + rightCount;
    }

    // 4. Improving the input taking Method
    public static BinaryTreeNode<Integer> takeInputBettter(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.print("Enter Root Data : ");
        } else {
            if (isLeft) {
                System.out.println("Enter Left Child of " + parentData + " : ");
            } else {
                System.out.println("Enter Right Child of " + parentData + " : ");

            }
        }
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> leftChild = takeInputBettter(false, data, true);
        BinaryTreeNode<Integer> rightChild = takeInputBettter(false, data, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    // 3. take input from user
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

    // 2. detailed print function
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
    // 1. Printing the Tree

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

        // BinaryTreeNode<Integer> tree = takeInput();
        BinaryTreeNode<Integer> tree = takeInputBettter(true, 0, true);

        // printing Elements of Tree
        printTree(tree);
        System.out.println("Detailed Tree Structure");
        printTreeDetailed(tree);
        int nodes = countNodes(tree);
        System.out.println("No of Node in Tree is : " + nodes);

    }
}
// start tree traversal