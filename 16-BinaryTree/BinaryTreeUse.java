
public class BinaryTreeUse {

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
        BinaryTreeNode<Integer> tree = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> treeLeft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> treeRight = new BinaryTreeNode<>(3);

        tree.left = treeLeft;
        tree.right = treeRight;

        BinaryTreeNode<Integer> AnotherLeft = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> AnotherRight = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> Node = new BinaryTreeNode<>(6);

        treeLeft.left = AnotherLeft;
        treeRight.right = AnotherRight;
        treeRight.left = Node;

        // printing Elements of Tree
        printTree(tree);

    }
}
