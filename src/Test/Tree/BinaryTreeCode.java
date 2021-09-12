package Test.Tree;
import java.util.Scanner;

public class BinaryTreeCode {

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){

        System.out.println("Enter next Node data");
        int rootData=sc.nextInt();
        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        root.left=takeInput(sc);
        root.right=takeInput(sc);

        return root;
    }

    public static void printTree(BinaryTreeNode<Integer> root){

        if(root==null){
            return;
        }

        String print=root.data + " :";

        if(root.left!=null){
            print+= " L: "+ root.left.data + ",";
        }

        if(root.right!=null){
            print+= " R: "+ root.right.data;
        }
        System.out.println(print);
        printTree(root.left);
        printTree(root.right);
    }

    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    public static void inOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData=sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();

        pendingNodes.enQueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front= pendingNodes.deQueue();
//Left Child
            System.out.println("Enter left child of "+ front.data);
            int leftData=sc.nextInt();
            if(leftData!=-1){
                BinaryTreeNode<Integer> leftChild =new BinaryTreeNode<>(leftData);
                pendingNodes.enQueue(leftChild);
                front.left=leftChild;
            }
//right Child
            System.out.println("Enter right child of "+ front.data);
            int rightData =sc.nextInt();
            if(rightData !=-1){
                BinaryTreeNode<Integer> rightChild =new BinaryTreeNode<>(rightData);
                pendingNodes.enQueue(rightChild);
                front.right=rightChild;
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) throws Exception {

        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        pendingNodes.enQueue(root);

        while(!pendingNodes.isEmpty()){

            BinaryTreeNode<Integer> front=pendingNodes.deQueue();

            System.out.print(front.data + " ");

            if(front.left!=null){
                pendingNodes.enQueue(front.left);
            }
            if(front.right!=null){
                pendingNodes.enQueue(front.right);
            }
        }
    }

    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int ans=1;
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);

        return ans;
    }

    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){

        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return null;
        }

        root.left=removeLeaf(root.left);
        root.right=removeLeaf(root.right);

        return root;

    }

    public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root){

        if(root==null){
            return null;
        }

        mirror(root.left);
        mirror(root.right);

        BinaryTreeNode<Integer> tempNode;
        tempNode=root.left;
        root.left= root.right;
        root.right=tempNode;

        return root;

    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);

        return 1+ Math.max(lh,rh);
    }

    public static int countLeafNodes(BinaryTreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        if(root.left==null&& root.right==null) {
            return 1;
        }
        return countNodes(root.left) + countNodes(root.right);

    }

    public static int diameter(BinaryTreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int opt1= Height(root.left)+ height((root.right));
        int opt2=diameter(root.left);
        int opt3=diameter(root.right);

        return Math.max(opt1,Math.max(opt2,opt3));

    }

    public static int Height(BinaryTreeNode<Integer> root){

        if(root==null)
            return 0 ;
        return 1+Math.max(Height(root.left), Height(root.right));

    }

    public static TestPair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){
        // first is height;
        // second is diameter;

        if(root==null){
            TestPair<Integer,Integer> output=new TestPair<>();
            output.first=0;
            output.second=0;
            return output;
        }
        TestPair<Integer,Integer> lo=heightDiameter(root.left);
        TestPair<Integer,Integer> ro=heightDiameter(root.right);

        int height=1+Math.max(lo.first,ro.first);
        int opt1=lo.first+ ro.first;
        int opt2=lo.second;
        int opt3=ro.second;

        int dia=Math.max(opt1,Math.max(opt2,opt3));

        TestPair<Integer,Integer> output=new TestPair<>();
        output.first=height;
        output.second=dia;
        return output;
    }

    public static BinaryTreeNode<Integer> buildTree(int in[],int pre[]){

        return  buildTreeHelper(in,pre,0,in.length-1,0,pre.length-1);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int in[],int pre[],int inS,int inE,int preS,int preE){

        if(inS>inE){
            return null;
        }

        int rootData=pre[preS];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int rootIndex=-1;
        for(int i=0;i<pre.length;i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }
        if(rootIndex==-1){
            return null;
        }

        int leftInS = inS;
        int leftInE = rootIndex-1;
        int leftPreS = preS+1;
        int leftPreE = leftInE-leftInS+leftPreS;

        int rightInS = rootIndex+1;
        int rightInE = inE;
        int rightPreS = leftPreE+1;
        int rightPreE = preE;


        root.left=buildTreeHelper(in,pre,leftInS,leftInE,leftPreS,leftPreE);
        root.right=buildTreeHelper(in,pre,rightInS,rightInE,rightPreS,rightPreE);

return root;

    }




    public static void main(String[] args) throws Exception {

//        Scanner sc=new Scanner(System.in);
//        BinaryTreeNode<Integer> root=takeInput(sc);

//        BinaryTreeNode<Integer>root=takeInputLevelWise();
//
//        printTree(root);
//        System.out.println();

//        System.out.println("Diameter of a tree is "+ diameter(root));
//        System.out.println("Diameter of a tree is "+ heightDiameter(root).second);

        int in[]={4,2,5,1,3,7};
        int pre[]={1,2,4,5,3,7};
        BinaryTreeNode<Integer> root1= buildTree(in,pre);

        System.out.println("Printing new Tree");

        printTree(root1);
        System.out.println();


//        System.out.println("Total no of lead Nodes are "+ countLeafNodes(root));

//        System.out.println("Height of the tree is " + height(root));

//        System.out.println("Mirror of a tree");
//        mirror(root);
//        printTree(root);

//        System.out.println("After removing Leaf Nodes");
//        BinaryTreeNode<Integer> newRoot=removeLeaf(root);
//        printTree(newRoot);

//        System.out.println("No of Nodes are = " + countNodes(root));


//          System.out.println("Level Wise Traversal of tree ");
//          printLevelWise(root);
//          System.out.println();

//        System.out.println("PreOrder of tree ");
//        preOrder(root);
//        System.out.println();
//
//        System.out.println("PostOrder of tree ");
//        postOrder(root);
//        System.out.println();
//
//        System.out.println("inOrder of tree ");
//        inOrder(root);
//        System.out.println();

    }

}

// 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1