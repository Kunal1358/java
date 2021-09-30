package Test.DS.BinaryTrees;

public class BasicUse {

    public static void main(String[] args) {

        BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node3=new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> node4=new BinaryTreeNode<>(4);

        node1.left=node2;
        node1.right=node3;
        node3.right=node4;


    }

}
