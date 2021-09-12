package DataStructures.Trees.CodingNinjas.BinaryTree;

public class BinaryTreeClassUse {

    public static void main(String[] args) {

        BinaryTreeClass BST=new BinaryTreeClass();
        BST.insert(10);
        BST.insert(20);
        BST.insert(5);
        BST.insert(15);
        BST.insert(3);
        BST.insert(7);

        BST.printTree();
        System.out.println();

        BST.delete(10);
        BST.printTree();


    }

}
