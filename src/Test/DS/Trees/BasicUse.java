package Test.DS.Trees;

public class BasicUse {

    public static void main(String[] args) {
        TreeNode<Integer> node1=new TreeNode<>(1);
        TreeNode<Integer> node2=new TreeNode<>(2);
        TreeNode<Integer> node3=new TreeNode<>(3);
        TreeNode<Integer> node4=new TreeNode<>(4);
        TreeNode<Integer> node5=new TreeNode<>(5);

        node1.children.add(node2);
        node1.children.add(node2);
        node1.children.add(node4);

        node3.children.add(node5);

    }

}
