package DataStructures.Trees.CodingNinjas.BinaryTree;

public class BinaryTreeClass {

    private BinaryTreeNode<Integer> root;


    private boolean isPresentHelper(int data,BinaryTreeNode<Integer> root){

        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        else if(root.data>data){
            // call left
            return isPresentHelper(data,root.left);
        }
        else{
            // call left
            return isPresentHelper(data,root.right);
        }
    }

    public boolean isPresent(int data){
        return isPresentHelper(data,root);
    }

    private BinaryTreeNode<Integer> insertHelper(int data,BinaryTreeNode<Integer> root){

        if(root==null){
            BinaryTreeNode<Integer> newNode=new BinaryTreeNode<>(data);
            return newNode;
        }
        if(root.data>data){
            root.left=insertHelper(data,root.left);
        }else{
            root.right=insertHelper(data,root.right);
        }
        return root;
    }

    public void insert(int data){
        root= insertHelper(data,root);
    }

    private BinaryTreeNode<Integer> deleteHelper(int data,BinaryTreeNode<Integer> root){

        if(root==null){
            return null;
        }

        if(root.data>data){ // if root data is > than data call left
            root.left=deleteHelper(data,root.left);
            return root;
        }else if(root.data<data){ // if root data is < than data call right
            root.right=deleteHelper(data,root.right);
            return root;
        }

        else{ // we are deleting the root

            if(root.left==null && root.right==null){ // root is a leaf node
                return null;
            }else if(root.left==null){ // if left node is null go to right
                return root.right;
            }else if(root.right==null){ // if right is null go to left
                return root.left;
            }else {                     // update the root data and call delete func.
                BinaryTreeNode<Integer> minNode=root.right;
                while (minNode.left!=null){
                    minNode=minNode.left;
                }
                root.data=minNode.data;
                root.right=deleteHelper(minNode.data,root.right);
                return root;
            }
        }
    }

    public void delete(int data){
        root=deleteHelper(data,root);
    }

    private void printTree(BinaryTreeNode<Integer> root){

        if(root==null)
            return;

        String print= root.data+ " : ";

        if(root.left !=null){
            print+= " L: " + root.left.data +",";
        }
        if(root.right !=null){
            print+= " R: " + root.right.data;
        }

        System.out.println(print);

        printTree(root.left);
        printTree(root.right);

    }

    public void printTree(){
        printTree(root);
    }

}
