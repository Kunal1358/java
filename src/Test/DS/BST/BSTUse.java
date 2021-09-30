package Test.DS.BST;

import com.sun.java.swing.plaf.windows.WindowsToggleButtonUI;

import java.net.Inet4Address;
import java.util.Scanner;

public class BSTUse {

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){

        System.out.println("Enter next node data");
        int rootData =sc.nextInt();

        if(rootData ==-1){ // Base Case
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        root.left=takeInput(sc);
        root.right=takeInput(sc);

        return root;

    }

    public static void printTree(BinaryTreeNode<Integer> root){

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

    public static BinaryTreeNode<Integer> takeInputLevelWise(){

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

            try {
                BinaryTreeNode<Integer> front= pendingNodes.deQueue();
// Left Node
                System.out.println("Enter Left child of " + front.data);
                int leftChild= sc.nextInt();
                if(leftChild!=-1) {
                    BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                    pendingNodes.enQueue(child);
                    front.left=child;
                }
/// Right Node

                System.out.println("Enter right child of " + front.data);
                int rightChild = sc.nextInt();
                if(rightChild !=-1) {
                    BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                    pendingNodes.enQueue(child);
                    front.right=child;
                }

            } catch (Exception e) {
                return null;
            }
        }return root;

    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) throws Exception {

        if(root==null){
            return;
        }

        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();

        pendingNodes.enQueue(root);
        pendingNodes.enQueue(null);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front=pendingNodes.deQueue();

            if(front==null){
                System.out.println();
                if(!pendingNodes.isEmpty()){
                    pendingNodes.enQueue(null);
                }
            }else {
                System.out.print(front.data+ " ");

                if(front.left!=null){
                    pendingNodes.enQueue(front.left);
                }

                if(front.right!=null){
                    pendingNodes.enQueue(front.right);
                }
            }
        }
    }

    public static void inOrder(BinaryTreeNode<Integer> root){

        if(root==null){ // Base Case
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);

    }

    public static void postOrder(BinaryTreeNode<Integer> root){

        if(root==null){ // Base Case
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    public static void preOrder(BinaryTreeNode<Integer> root){

        if(root==null){ // Base Case
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root,int k){

        if(root==null){
            return null;
        }
        if(root.data.equals(k)){
            return root;
        }
        if(root.data > k){
            return searchInBST(root.left,k);

        } else {
            return searchInBST(root.right , k);
        }
    }

    public static void printInRange(BinaryTreeNode<Integer> root,int min , int max){

        if(root==null){
            return;
        }

        if(min<root.data){
            printInRange(root.left,min,max);
        }

        if(min<=root.data && max>=root.data){
            System.out.print(root.data+" ");
        }

        printInRange(root.right,min,max);


    }

    private static int max(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftMax=max(root.left);
        int rightMax=max(root.right);
        return Math.max(root.data , Math.max( leftMax,rightMax ) );
    }

    private static int min(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int leftMin=min(root.left);
        int rightMin=min(root.right);
        return Math.min(root.data , Math.min( leftMin,rightMin ) );
    }

    public static boolean isBst(BinaryTreeNode<Integer> root){

        if(root==null){
            return true;
        }

        int leftMax=max(root.left);
        int rightMin=min(root.right);

        if(root.data<leftMax){
            return false;
        }
        if(root.data>rightMin){
            return false;
        }

        boolean isLeftBST=isBst(root.left);
        boolean isRightBST=isBst(root.right);

        if(isLeftBST && isRightBST){
            return true;
        }else
            return false;
    }

    private static Pair<Boolean, Pair<Integer,Integer>> isBstBetter(BinaryTreeNode<Integer> root){

        if(root==null){
            Pair<Boolean, Pair<Integer,Integer>> output=new Pair<>();
            output.first=true;
            output.second=new Pair<>();
            output.second.first=Integer.MAX_VALUE;
            output.second.second=Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean, Pair<Integer,Integer>> leftOutput=isBstBetter(root.left);
        Pair<Boolean, Pair<Integer,Integer>> rightOutput=isBstBetter(root.right);

        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));

        boolean isBst= (root.data>leftOutput.second.second)
                && (root.data<rightOutput.second.first)
                && leftOutput.first
                && rightOutput.first;

        Pair<Boolean, Pair<Integer,Integer>> output=new Pair<>();
        output.first=isBst;
        output.second=new Pair<>();
        output.second.first=min;
        output.second.second=max;
        return output;


    }

//    public static LinkedListNode<Integer> BstToSortedLL(BinaryTreeNode<Integer> root){
//        return constructLinkedListhelper(root).head;
//    }

//    private static PairLL constructLinkedListhelper(BinaryTreeNode<Integer> root) {
//
//        if(root==null){
//            PairLL pair=new PairLL();
//            return pair;
//        }
//    }


//
//    public static int counter=0;
//    private static LinkedListNode<Integer> head;
//    private static LinkedListNode<Integer> temp;


//    public static LinkedListNode<Integer> BstToSortedLL(BinaryTreeNode<Integer> root){
//
//        if(root==null){
//            return null;
//        }
//        LinkedListNode<Integer> newNode=new LinkedListNode<>(root.data);
//        BstToSortedLL(root.left);
//        if(counter==1){
//            temp.next=newNode;
//            temp=temp.next;
//        }
//        if(head==null){
//            counter++;
//            if(counter==1){
//                head=newNode;
//                temp=head;
//            }
//        }
//        BstToSortedLL(root.right);
//
//        return head;
//
//    }

    private static int counter=0;
    private static LinkedListNode<Integer> head;
    private static LinkedListNode<Integer> tail;

    private static LinkedListNode<Integer> BstToSortedLL(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        LinkedListNode<Integer> newNode=new LinkedListNode<>(root.data);
        BstToSortedLL(root.left);

        if(counter==1){
            tail.next=newNode;
            tail=tail.next;
        }
        if(counter==0){
            counter++;
            if(counter==1){
                head=newNode;
                tail=head;
            }
        }
        BstToSortedLL(root.right);
        return head;
    }

    public static int getLca(BinaryTreeNode<Integer> root, int a, int b){

        BinaryTreeNode<Integer> ans=findLca(root,a,b);
        return (ans==null)? 0:ans.data;

    }

    private static BinaryTreeNode<Integer> findLca(BinaryTreeNode<Integer> root, int a, int b) {

        if(root==null || root.data ==a || root.data==b){
            return root;
        }
        if(root.data<a && root.data <b){
            return findLca(root.right,a,b);
        }
        if(root.data>a && root.data >b){
            return findLca(root.left,a,b);
        }
        BinaryTreeNode<Integer> leftLca=findLca(root.left,a,b);
        BinaryTreeNode<Integer> rightLca=findLca(root.left,a,b);

        if(leftLca!=null && rightLca !=null){
            return root;
        }
        if(leftLca!=null){
            return leftLca;
        }else {
            return rightLca;
        }
    }

    public static int replaceWithLargerSumHelper(BinaryTreeNode<Integer>root ,int sum){

        if(root==null){
            return sum;
        }
        sum=replaceWithLargerSumHelper(root.left,sum);
        sum+=root.data;
        root.data=sum;
        sum=replaceWithLargerSumHelper(root.right,sum);

        return sum;
    }

    private static void replaceWithLargerSum(BinaryTreeNode<Integer> root){
        replaceWithLargerSumHelper(root,0);
    }


    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        BinaryTreeNode<Integer> root=takeInputLevelWise();
        System.out.println();

        printLevelWise(root);
        System.out.println();

//        BinaryTreeNode<Integer> num= searchInBST(root,1);
//
//        if(num!=null){
//            System.out.println(num.data);
//        }
//
//        System.out.println("Printing in range");
//        printInRange(root,10,50);

//        System.out.println("Is balance: "+ isBstBetter(root).first);

//        System.out.println("Linked List");
//        LinkedListNode<Integer> head =BstToSortedLL(root);
//        while (head !=null){
//            System.out.print(head.data+" ");
//            head = head.next;
//        }

        System.out.println("Lca: "+ getLca(root,40,10));
        System.out.println();
        replaceWithLargerSum(root);
        printLevelWise(root);






    }

}

// 40 20 60 10 30 50 70 -1 -1 -1 -1 -1 -1 -1 -1

// 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1