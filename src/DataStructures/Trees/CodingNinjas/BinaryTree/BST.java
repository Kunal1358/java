package DataStructures.Trees.CodingNinjas.BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BST {

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

    public static BinaryTreeNode<Integer> findNum(BinaryTreeNode<Integer> root,int num){

        if(root== null){
            return null;
        }
        if(root.data==null){
            return root;
        }

        if(num>root.data){
         return findNum(root.right,num);
        }else {
            return findNum(root.right,num);
        }

    }

    public static void printInRange(BinaryTreeNode<Integer> root, int min, int max){

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

    public static int max(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }

    public static int min(BinaryTreeNode<Integer> root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }

    public static boolean isBst(BinaryTreeNode<Integer> root){
        if(root==null){
            return true;
        }

        int leftMax = max(root.left);
        int rightMin = min(root.right);

        if(root.data<leftMax){
            return false;
        }
        if(root.data>rightMin){
            return false;
        }

        boolean isLeftBst=isBst(root.left);
        boolean isRightBst=isBst(root.left);

        if(isLeftBst && isRightBst){
            return true;
        }else
            return false;

    }

    public static Pair<Boolean , Pair<Integer,Integer>> isBst2(BinaryTreeNode<Integer> root){

        // first - min
        // second - max
        if(root==null){
            Pair<Boolean , Pair<Integer,Integer>> output=new Pair<>();
            output.first=true;
            output.second=new Pair<Integer,Integer>();
            output.second.first=Integer.MAX_VALUE;
            output.second.second=Integer.MIN_VALUE;
            return output;
        }

        Pair<Boolean,Pair<Integer,Integer>> leftOutput=isBst2(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOutput=isBst2(root.right);

        int min=Math.min(root.data,Math.min(leftOutput.second.first,rightOutput.second.first));
        int max=Math.max(root.data,Math.max(leftOutput.second.second,rightOutput.second.second));

        boolean isBst = (root.data>leftOutput.second.second)
                && (root.data<rightOutput.second.first)
                && leftOutput.first && rightOutput.first;

        Pair<Boolean , Pair<Integer,Integer>> output=new Pair<>();
        output.first=isBst;
        output.second=new Pair<Integer,Integer>();
        output.second.first=min;
        output.second.second=max;
        return output;
    }

    public static boolean isBst3(BinaryTreeNode<Integer> root , int min,int max){

        if(root==null){
            return true;
        }
        if(root.data<min || root.data> max){
            return false;
        }
        boolean isLeftOK= isBst3(root.left,min , root.data-1);
        boolean isRightOK= isBst3(root.right, root.data+1, max);

        return isLeftOK && isRightOK;

    }

    public static BinaryTreeNode<Integer> createBstFromArray(int arr[],int startIndex,int endIndex){

        if(startIndex>endIndex){
            return null;
        }

        int middle=(startIndex+endIndex)/2;

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[middle]);
        root.left=createBstFromArray(arr,startIndex,middle-1);
        root.right=createBstFromArray(arr,middle+1,endIndex);

        return root;
    }

    public static void printInK1K2(BinaryTreeNode<Integer> root,int k1,int k2){

        if(root==null){
            return;
        }
        if(root.data<k1){
            printInK1K2(root.right,k1,k2);
        }else if(root.data>k2){
            printInK1K2(root.left,k1,k2);
        }else {
            System.out.print(root.data+ " ");
            printInK1K2(root.right,k1,k2);
            printInK1K2(root.left,k1,k2);
        }
    }

    public static ArrayList<Integer> getRootToNodePathInBST(BinaryTreeNode<Integer> root, int data){

        if(root==null){
            return null;
        }
        if(root.data==data){
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }

        if(root.data>data){
            ArrayList<Integer> leftOutput= getRootToNodePathInBST(root.left, data);
            if(leftOutput!=null){
                leftOutput.add(root.data);
                return leftOutput;
            }
        }

        if(root.data<data){
            ArrayList<Integer> rightOutput = getRootToNodePathInBST(root.right, data);
            if(rightOutput !=null){
                rightOutput.add(root.data);
                return rightOutput;
            }else {
                return null;
            }
        }
        return null;
    }

    public static LinkedListNode<Integer> BstToLL(BinaryTreeNode<Integer>root){

        return constructLinkedListHelper(root).head;
    }

    public static PairOFElemt constructLinkedListHelper(BinaryTreeNode<Integer> root){

        if(root==null){
            PairOFElemt pair=new PairOFElemt();
            return pair;
        }

        LinkedListNode<Integer> newNode=new LinkedListNode<>(root.data);
        PairOFElemt leftList= constructLinkedListHelper(root.left);
        PairOFElemt rightList= constructLinkedListHelper(root.right);

        PairOFElemt pair=new PairOFElemt();
        if(leftList.tail!=null){
            leftList.tail.next=newNode;
        }
        newNode.next=rightList.head;

        if(leftList.head!=null){
            pair.head=leftList.head;
        }else{
            pair.head=newNode;
        }

        if(rightList.tail!=null){
            pair.tail=rightList.tail;
        }else{
            pair.head=newNode;
            pair.tail=newNode;
        }
        return pair;

    }

    private static int counter=0;
    private static LinkedListNode<Integer> head;
    private static LinkedListNode<Integer> tail;

    public static LinkedListNode<Integer> BstToSortedLL(BinaryTreeNode<Integer> root){
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

    private static BinaryTreeNode<Integer> findLCA(BinaryTreeNode<Integer>root,int a,int b){

        if(root==null || root.data==a || root.data==b){
            return root;
        }
        if(root.data<a && root.data<b){
            return findLCA(root.right,a,b);
        }
        else if(root.data>a && root.data>b){
            return findLCA(root.left,a,b);
        }
        BinaryTreeNode<Integer> leftLCA = findLCA(root.left,a,b);
        BinaryTreeNode<Integer> rightLCA = findLCA(root.right,a,b);

        if(leftLCA!=null && rightLCA!=null){
            return root;
        }
        else if(leftLCA!=null){
            return leftLCA;
        }
        return rightLCA;
    }

    public static int getLCA(BinaryTreeNode<Integer>root,int a,int b){
        BinaryTreeNode<Integer> node=findLCA(root,a,b);
        return (node==null) ? -1 : node.data;
    }

    private static int replaceWithLargerSumNodeHelper(BinaryTreeNode<Integer> root, int sum){
        if(root==null){
            return sum;
        }
        sum= replaceWithLargerSumNodeHelper(root.right,sum);
        sum+=root.data;
        root.data=sum;
        sum= replaceWithLargerSumNodeHelper(root.left,sum);

        return sum;
    }

    public static void replaceWithLargerSumNode(BinaryTreeNode<Integer> root){
        int sum=0;
        replaceWithLargerSumNodeHelper(root,sum);
    }




    public static void main(String[] args) throws Exception {

        BinaryTreeNode<Integer> root=takeInputLevelWise();
        printTree(root);

//        System.out.println("Printing in range");
//        printInK1K2(root,40,40);

//        System.out.println("Printing root to node path");
//        ArrayList<Integer> output=getRootToNodePathInBST(root,40);
//        System.out.println(output);


//        System.out.println("Print in range");
//        printInRange(root,10,30);

        System.out.println("Is Bst "+ isBst2(root).first);


//        int arr[]={1,2,3,4,5,6,7};
//        BinaryTreeNode<Integer> newNode=createBstFromArray(arr,0,arr.length-1);
//        printTree(newNode);
//        System.out.println();
//        preOrder(newNode);
//
//          BinaryTreeNode<Integer> root=takeInputLevelWise();
//          LinkedListNode<Integer>LLnode=BSTtoSortedLL(root);
//        System.out.println("Printing LL");
//          printLL(LLnode);
//

//        System.out.println("Binary Tree to Sorted LL");
//        LinkedListNode<Integer> node=BstToLL(root);
//
//        while(node!=null){
//            System.out.printDFS(node.data+ " ");
//            node=node.next;
//        }

//        System.out.println("LCA");
//        System.out.println(getLCA(root,12,78));
//
//        System.out.println("Replace node with sum value");
//        replaceWithLargerSumNode(root);
//        printLevelWise(root);


    }

}

// 40 20 60 10 30 50 70 -1 -1 -1 -1 -1 -1 -1 -1

// 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1