package Test.DS.BinaryTrees;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){

        System.out.println("Enter next Node data");
        int nodeData= sc.nextInt();
        if(nodeData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(nodeData);
        root.left=takeInput(sc);
        root.right=takeInput(sc);
        return root;
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        String output=root.data+" => ";
        if(root.left!=null){
            output+= "L: "+root.left.data+",";
        }
        if(root.right!=null){
            output+= "R: "+root.right.data;
        }
        System.out.println(output);

        printTree(root.left);
        printTree(root.right);

    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        QueueUsingLL<BinaryTreeNode<Integer>> queue=new QueueUsingLL<>();
        queue.enQueue(root);

        while (!queue.isEmpty()){
            BinaryTreeNode<Integer> front= queue.deQueue();
            System.out.println("Enter Left Child of "+ front.data);
            int leftChildData= sc.nextInt();
            // left child
            if(leftChildData!=-1){
                BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<>(leftChildData);
                queue.enQueue(leftChild);
                front.left=leftChild;
            }
            // right child
            System.out.println("Enter Right Child of "+ front.data);
            int rightChildData = sc.nextInt();
            if(rightChildData !=-1){
                BinaryTreeNode<Integer> rightChild =new BinaryTreeNode<>(rightChildData);
                queue.enQueue(rightChild);
                front.right= rightChild;
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) throws Exception {

        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes =new QueueUsingLL<>();
        pendingNodes.enQueue(root);
        pendingNodes.enQueue(null);

        while (!pendingNodes.isEmpty()){

            BinaryTreeNode<Integer> front= pendingNodes.deQueue();
            if(front==null){
                System.out.println();
                if(!pendingNodes.isEmpty()){
                    pendingNodes.enQueue(null);
                }
            }else {

                System.out.print(front.data+" ");

                if(front.left!=null){
                    pendingNodes.enQueue(front.left);
                }

                if(front.right!=null) {
                    pendingNodes.enQueue(front.right);
                }

            }
        }
    }

    public static void preOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data);

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.data);
    }

    public static void InOrder(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data);
        InOrder(root.right);
    }

    public static int countNodes(BinaryTreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int count=1;
        count+=countNodes(root.left);
        count+=countNodes(root.right);

        return count;

    }

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){

        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return null;
        }

        root.left=removeLeafNodes(root.left);
        root.right=removeLeafNodes(root.right);

        return root;

    }

    public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }

        mirror(root.left);
        mirror(root.right);

        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;

        return root;

    }

    public static int diameter(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }

        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.max(option1 , Math.max(option2,option3));

    }

    public static int height(BinaryTreeNode<Integer> root) {

        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+ Math.max(lh,rh);
    }

    public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root){

        if(root==null){
            Pair<Integer,Integer> output=new Pair<>();
            output.first=0;
            output.second=0;
            return output;
        }

        Pair<Integer,Integer> lo=heightDiameter(root.left);
        Pair<Integer,Integer> ro=heightDiameter(root.right);
        int height=1+Math.max(lo.first,ro.first);

        int option1=lo.first+ro.first;
        int option2=lo.second;
        int option3=ro.second;

        int dia=Math.max(option1 , Math.max(option2,option3));

        Pair<Integer,Integer> output=new Pair<>();
        output.first=height;
        output.second=dia;
        return output;
    }

    public static BinaryTreeNode<Integer> buildTreeInPre(int in[],int pre[]){

        return buildTreeInPreHelper(in,pre,0,in.length-1,0,pre.length-1);
    }

    private static BinaryTreeNode<Integer> buildTreeInPreHelper(int[] in, int[] pre, int inS, int inE, int preS, int preE) {

        if(inS>inE){
            return null;
        }
        int rootData=pre[preS];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int rootIndex=-1;
        for(int i=inS;i<=inE;i++){
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

        root.left=buildTreeInPreHelper(in,pre,leftInS,leftInE,leftPreS,leftPreE);
        root.right=buildTreeInPreHelper(in,pre,rightInS,rightInE,rightPreS,rightPreE);

        return root;
    }

    public static BinaryTreeNode<Integer> buildTreeInPost(int in[],int post[]){

        return buildTreeInPostHelper(in, post,0,in.length-1,0, post.length-1);
    }

    private static BinaryTreeNode<Integer> buildTreeInPostHelper(int[] in, int[] post, int inS, int inE, int postS, int postE) {

        if(postS>postE || inS>inE){
            return null;
        }

        int rootData= post[postE];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int rootIndex=-1;
        for(int i=inS;i<=inE;i++){
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
        int leftPostS = postS;
        int leftPostE = leftPostS + leftInE - leftInS;


        int rightInS = rootIndex+1;
        int rightInE = inE;
        int rightPostS = leftPostE +1;
        int rightPostE = postE-1;

        root.left=buildTreeInPostHelper(in, post,leftInS,leftInE, leftPostS, leftPostE);
        root.right=buildTreeInPostHelper(in, post,rightInS,rightInE,rightPostS, rightPostE);

        return root;
    }

    public static boolean isBalance(BinaryTreeNode<Integer> root){

        if(root==null){
            return true;
        }

        int lh=heightOfBalance(root.left);
        int rh=heightOfBalance(root.right);

        if(Math.abs(lh-rh)>1){
            return false;
        }

        boolean isLeftBalance=isBalance(root.left);
        boolean isRightBalance=isBalance(root.right);

        return isLeftBalance && isRightBalance;

    }

    private static int heightOfBalance(BinaryTreeNode<Integer> root) {

        if(root==null){
            return 0;
        }
        int lh=heightOfBalance(root.left);
        int rh=heightOfBalance(root.right);

        return 1+Math.max(lh,rh);

    }

    public static BalancePair<Integer,Boolean> isBalanceBetter(BinaryTreeNode<Integer> root){

        if(root==null){
            BalancePair<Integer,Boolean> output=new BalancePair<>();
            output.height=0;
            output.isBalance=true;
            return output;
        }
        BalancePair<Integer,Boolean> leftOutput=isBalanceBetter(root.left);
        BalancePair<Integer,Boolean> rightOutput=isBalanceBetter(root.right);

        int height= 1+ Math.max(leftOutput.height , rightOutput.height);
        boolean isBalance=true;

        if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isBalance=false;
        }
        if(!leftOutput.isBalance || !rightOutput.isBalance){
            isBalance=false;
        }

        BalancePair<Integer,Boolean> output=new BalancePair<>();
        output.height=height;
        output.isBalance=isBalance;
        return output;
    }

    public static BinaryTreeNode<Integer> insertDuplicateRight(BinaryTreeNode<Integer> root){

        if(root==null){
            return null;
        }
        BinaryTreeNode<Integer> newNode=new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootRight=root.right;

        root.right=newNode;
        newNode.right=rootRight;

        insertDuplicateRight(rootRight);
        insertDuplicateRight(root.left);

        return root;
    }

    public static BinaryTreeNode<Integer> insertDuplicateLeft(BinaryTreeNode<Integer> root){

        if(root==null){
            return null;
        }

        BinaryTreeNode<Integer> newNode=new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft=root.left;

        root.left=newNode;
        newNode.left=rootLeft;

        insertDuplicateLeft(rootLeft);
        insertDuplicateLeft(root.right);

        return root;
    }

    public static Pair<Integer,Integer> getMinMAx(BinaryTreeNode<Integer> root){

        if(root==null){
            Pair<Integer,Integer> output=new Pair<>();
            output.min=Integer.MAX_VALUE;
            output.max=Integer.MIN_VALUE;
            return output;
        }
        Pair<Integer,Integer> leftOutput=getMinMAx(root.left);
        Pair<Integer,Integer> rightOutput=getMinMAx(root.right);

        int max= Math.max(root.data , Math.max(leftOutput.max,rightOutput.max));
        int min=Math.min(root.data, Math.min(leftOutput.min,rightOutput.min));

        Pair<Integer,Integer> output=new Pair<>();
        output.min=min;
        output.max=max;
        return output;

    }

    public static void pathSumRootToLeaf(BinaryTreeNode<Integer> root,int k){

        pathHelper(root,k," ",0);

    }

    private static void pathHelper(BinaryTreeNode<Integer> root,int k, String path, int currSum) {

        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            currSum+=root.data;
            if(currSum==k){
                System.out.println(path+root.data);
            }
            return;
        }

        pathHelper(root.left,k,(path+ root.data+" "),(currSum+root.data));
        pathHelper(root.right,k,(path+ root.data+" "),(currSum+root.data));

    }

    public static ArrayList<Integer> getPathToRoot(BinaryTreeNode<Integer> root ,int data){

        if(root==null){
            return null;
        }

        if(root.data==data){
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput=getPathToRoot(root.left,data);
        if(leftOutput!=null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput =getPathToRoot(root.right,data);
        if(rightOutput !=null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        else {
            return null;
        }
    }

    public static void nodeAtDistanceK(BinaryTreeNode<Integer> root , int node,int k){
        nodeAtDistanceKHelper(root,node,k);
    }

    public static int nodeAtDistanceKHelper(BinaryTreeNode<Integer> root, int target,int k){

        if(root==null){
            return -1;
        }
        if(root.data==target){
            nodeAtDistanceKDown(root,k);
            return 0;
        }
        int leftDist=nodeAtDistanceKHelper(root.left,target,k);

        if(leftDist!=-1){
            if(leftDist+1==k) {
                System.out.println(root.data);
            }else {
                nodeAtDistanceKDown(root.right,k-leftDist-2);
            }
            return 1+leftDist;
        }
        int rightDist=nodeAtDistanceKHelper(root.right,target,k);
        if(rightDist!=-1){
            if(rightDist+1==k) {
                System.out.println(root.data);
            }else {
                nodeAtDistanceKDown(root.left,k-rightDist-2);
            }
            return 1+rightDist;
        }
        return -1;
    }

    private static void nodeAtDistanceKDown(BinaryTreeNode<Integer> root, int k) {

        if(root==null){
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        nodeAtDistanceKDown(root.left,k-1);
        nodeAtDistanceKDown(root.right,k-1);

    }


    public static void main(String[] args) throws Exception {

//        Scanner sc=new Scanner(System.in);
//
////        BinaryTreeNode<Integer> root=takeInput(sc);
        BinaryTreeNode<Integer> root=takeInputLevelWise();
        printLevelWise(root);
        System.out.println();
//        printTree(root);

//        System.out.println();
//        System.out.println("Pre Order");
//        preOrder(root);
//
//        System.out.println();
//        System.out.println("Post Order");
//        postOrder(root);
//
//        System.out.println();
//        System.out.println("In Order");
//        InOrder(root);

//        System.out.println("No of Nodes are: "+ countNodes(root) );
//        System.out.println();

//        BinaryTreeNode<Integer> mirror =removeLeafNodes(root);
//        printLevelWise(mirror);
//          BinaryTreeNode<Integer> mirror =mirror(root);
//          printLevelWise(mirror);

//        System.out.println();
////        // Need to do dia + 1 at the end
//
//        System.out.println("Diameter: "+ heightDiameter(root).second);
//        System.out.println("Height: "+ heightDiameter(root).first);

//         // Pre + IN
//        int in[]={4,2,5,1,3,7};
//        int pre[]={1,2,4,5,3,7};
//        BinaryTreeNode<Integer> root1= buildTreeInPre(in,pre);
//        printTree(root1);
//

//         //Post +IN
//        int in[]={4,2,5,1,6,3};
//        int post[]={4,5,2,6,3,1};
//        BinaryTreeNode<Integer> root= buildTreeInPost(in,post);
//        printTree(root);
//
//        System.out.println();
//        System.out.println("Is Balance: "+ isBalanceBetter(root).isBalance);
//        System.out.println("Height: "+ isBalanceBetter(root).height);

//        System.out.println();
//        System.out.println("left Duplicate");
//        BinaryTreeNode<Integer> left=insertDuplicateLeft(root);
//        printTree(left);
//        System.out.println();

//        System.out.println();
//        System.out.println("right Duplicate");
//        BinaryTreeNode<Integer> right=insertDuplicateRight(root);
//        printTree(right);
//        System.out.println();
//
//        System.out.println();
//        System.out.println("Max: "+ getMinMAx(root).max);
//        System.out.println("Min: "+ getMinMAx(root).min);

//        System.out.println();
//        System.out.println("Printing Path");
//        pathSumRootToLeaf(root,13);

        System.out.println("printing Path");
        ArrayList<Integer> path=getPathToRoot(root,5);
        System.out.println(path);

        }

}
// 1 2 -1 -1 3 -1 4 -1 -1

// 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1