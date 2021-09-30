package DataStructures.Trees.CodingNinjas.BinaryTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTree {

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

    public static int countNodes(BinaryTreeNode<Integer> root){
        //Time complexity
        // We are checking base case and adding
        // Adding and base case take O(1)
        // We will visit all nodes - O(n)
        // So overall T.C is O(n)
        // Same for count, sum and largest

        if(root==null){ // Base Case
            return 0;
        }
        int ans=1;
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);

        return ans;

    }

    public static int diameter(BinaryTreeNode<Integer> root){ // not used due to bad TimeComplexity

        if(root==null){
            return 0;
        }

        int option1= height(root.left)+ height(root.right);
        int option2=diameter(root.left);
        int option3=diameter(root.right);

        return Math.max(option1 , Math.max(option2,option3));

    }

    private static int height(BinaryTreeNode<Integer> root) {

        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+ Math.max(lh,rh);
    }

    public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root) {

        // This is improved version of height and diameter
        // T.C = O(n)
        if(root==null){
            Pair<Integer , Integer> output= new Pair<>();
            output.first=0;
            output.second=0;
            return output;
        }

       Pair<Integer,Integer> lo=heightDiameter(root.left);
       Pair<Integer,Integer> ro=heightDiameter(root.right);

       int height=1+ Math.max(lo.first,ro.first); // Max height of Tree
       int option1 = lo.first + ro.first; // Height of left + right
       int option2 = lo.second; // Diameter of Left
       int option3 = ro.second; // Diameter of right

       int diameter=Math.max(option1, Math.max(option2,option3));

        Pair<Integer , Integer> output= new Pair<>();
        output.first=height;
        output.second=diameter;
        return output;

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

    public static BinaryTreeNode<Integer> buildTree(int in[],int pre[]){
        return buildTreeHelper(in , pre , 0 , in.length-1, 0 ,pre.length-1);
        // int in[] ,pre[]
        // start and end index of in
        // start and end index of re
    }

    private static BinaryTreeNode<Integer> buildTreeHelper(int[] in, int[] pre, int inS, int inE, int preS, int preE) {

        if(inS>inE){
            return null;
        }
        int rootData = pre[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);

        // to find root index
        int rootIndex=-1;
        for(int i=inS ; i <= inE ; i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }

        if(rootIndex==-1){ // shall not come
            return null;
        }

        // For Left sub tree
        int leftInS =  inS; // left inorder start
        int leftInE =  rootIndex-1; // left inorder end
        int leftpreS = preS+1;// left preorder start
        int leftpreE = leftInE-leftInS+ leftpreS;// left preorder end

        // For right sub tree
        int rightInS =  rootIndex + 1; // right inorder start
        int rightInE = inE; // right inorder end
        int rightpreS = leftpreE+1;// right preorder start
        int rightpreE = preE;// right preorder end

        root.left=buildTreeHelper(in,pre,leftInS,leftInE,leftpreS,leftpreE);
        root.right=buildTreeHelper(in,pre,rightInS,rightInE,rightpreS,rightpreE);


        return root;
    }

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){

        if(root==null)
            return null;

        if(root.left==null && root.right==null)
            return null;

        root.left=removeLeafNodes(root.left);
        root.right=removeLeafNodes(root.right);

        return root;

    }

    public static void mirror(BinaryTreeNode<Integer> root){
        if(root==null)
            return;

        mirror(root.left);
        mirror(root.right);

        BinaryTreeNode<Integer> templeft;
        templeft=root.left;
        root.left=root.right;
        root.right=templeft;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){

        if(root==null)
            return true;

        int leftHeight=heightOfBalance(root.left);
        int rightHeight=heightOfBalance(root.right);

        if(Math.abs(leftHeight - rightHeight)>1){
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isLeftBalanced;

    }

    private static int heightOfBalance(BinaryTreeNode<Integer> root) {

        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return 1+ Math.max(rightHeight,leftHeight);

    }

    public static BalancedTreeReturn isBalanceBetter(BinaryTreeNode<Integer> root){

        if(root==null){
            BalancedTreeReturn ans=new BalancedTreeReturn();
            ans.isBalance = true;
            ans.height=0;
            return ans;
        }
        BalancedTreeReturn leftOutput=isBalanceBetter(root.left);
        BalancedTreeReturn rightOutput=isBalanceBetter(root.right);

        int height= 1+ Math.max(leftOutput.height,rightOutput.height);
        boolean isbal=true;

        if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isbal = false;
        }
        if(!leftOutput.isBalance || !rightOutput.isBalance)
        {
            isbal = false;
        }
        BalancedTreeReturn ans=new BalancedTreeReturn();
        ans.isBalance = isbal;
        ans.height=height;
        return ans;

    }

    public static void insertDuplicateRight(BinaryTreeNode<Integer> root){

        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> newNode=new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootRight=root.right;

        root.right=newNode;
        newNode.right=rootRight;

        insertDuplicateRight(rootRight);
        insertDuplicateRight(root.left);
    }

    public static void insertDuplicateLeft(BinaryTreeNode<Integer> root){

        if(root==null){
            return;
        }
        BinaryTreeNode<Integer> newNode=new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft =root.right;

        root.left=newNode;
        newNode.left= rootLeft;

        insertDuplicateRight(rootLeft);
        insertDuplicateRight(root.right);
    }

    public static Pair<Integer,Integer> getMinMax(BinaryTreeNode<Integer> root) {

        if(root==null){
            Pair<Integer,Integer> output=new Pair<>();
            output.min=Integer.MAX_VALUE;
            output.max=Integer.MIN_VALUE;
            return output;
        }
        Pair<Integer,Integer> leftOutput=getMinMax(root.left);
        Pair<Integer,Integer> rightOutput=getMinMax(root.right);

        int max= Math.max(root.data, Math.max(leftOutput.max,rightOutput.max));
        int min= Math.min(root.data, Math.min(leftOutput.min,rightOutput.min));

        Pair<Integer,Integer> output=new Pair<>();
        output.min=min;
        output.max=max;
        return output;
    }

    public static BinaryTreeNode<Integer> createTree(int in[],int post[]){

        return createTreeHelper(in,post,0,in.length-1,0,post.length-1);
    }

    public static BinaryTreeNode<Integer> createTreeHelper (int in[],int post[],int inS,int inE,int postS,int postE){

        if(postS>postE || inS>inE){
            return null;
        }

        int rootData=post[postE];

        int rootIndex=-1;
        for(int i=inS;i<=inE;i++){
            if(in[i]==rootData){
                rootIndex=i;
                break;
            }
        }

        if (rootIndex == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);

        int leftInS = inS;
        int leftInE = rootIndex-1;
        int leftPostS = postS;
        int leftPostE = leftPostS + leftInE - leftInS;

        int rightInS = rootIndex+1;
        int rightInE = inE;
        int rightPostS = leftPostE+1 ;
        int rightPostE = postE-1 ;

        root.left=createTreeHelper(in,post,leftInS,leftInE,leftPostS,leftPostE);
        root.right= createTreeHelper(in,post,rightInS,rightInE,rightPostS,rightPostE);

        return root;

    }

    public static void pathSumRootToLeaf(BinaryTreeNode<Integer> root ,int k){

        pathHelper(root,k,"" ,0);

    }

    public static void pathHelper(BinaryTreeNode<Integer> root,int k,String path,int currSum){

       if(root==null){
           return;
       }

       if(root.left==null && root.right==null){
           currSum+=root.data;
           if(currSum==k){
               System.out.println(path + root.data);
           }
           return;
       }

       pathHelper(root.left,k , ( path + root.data + " " ),( currSum+root.data ));
       pathHelper(root.right,k , ( path + root.data + " " ),( currSum+root.data ));

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

    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root,int data){

        if(root==null){
            return null;
        }
        if(root.data==data){
            ArrayList<Integer> output=new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput=getRootToNodePath(root.left, data);
        if(leftOutput!=null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput =getRootToNodePath(root.right, data);
        if(rightOutput !=null){
            rightOutput.add(root.data);
            return rightOutput;
        }else {
            return null;
        }
    }


    public static void main(String[] args) throws Exception {

//        Scanner sc=new Scanner(System.in);
//        BinaryTreeNode<Integer> root= takeInput(sc);
//        preOrder(root);

//        BinaryTreeNode<Integer> root= takeInputLevelWise();
//        System.out.println("Printing Tree LevelWise");
//        printLevelWise(root);
//
//        System.out.println();
//        System.out.println(diameter(root));

//        System.out.println("Printing root to node path");
//        ArrayList<Integer> output=getRootToNodePath(root,70);
//        System.out.println(output);


//        System.out.println();
//        System.out.println("Path to K");
//        pathSumRootToLeaf(root,13);

//        System.out.println("Printing node at dist K");
//
//        nodeAtDistanceK(root,3,1);



//        System.out.println("Max is "+ getMinMax(root).max);
//        System.out.println("Min is "+ getMinMax(root).min);


        // Count no of Nodes
//        System.out.println();
//        System.out.println("Total No of Nodes = " + countNodes(root));

        // Old one
        //System.out.println("Diameter of tree is : " + diameter(root));

//        System.out.println("Diameter of tree is : "+ heightDiameter(root).second);
//        System.out.println("Height of tree is : "+ heightDiameter(root).first);

//        // Pre + IN
//        int in[]={4,2,5,1,3,7};
//        int pre[]={1,2,4,5,3,7};
//        BinaryTreeNode<Integer> root= buildTree(in,pre);
//        printTree(root);

        //Post +IN
        int in[]={4,2,5,1,6,3};
        int post[]={4,5,2,6,3,1};
        BinaryTreeNode<Integer> root= createTree(in,post);
        printTree(root);

//        System.out.println();
//        System.out.println("Inorder Traversal");
//        inOrder(root);
//
//        System.out.println();
//        System.out.println("Post Order Traversal");
//        postOrder(root);
//
//        System.out.println();
//        System.out.println("Pre Order Traversal");
//        preOrder(root);


//        BinaryTreeNode<Integer> newRoot=removeLeafNodes(root);
//        preOrder(newRoot);

//        mirror(root);
//        preOrder(root);

//        System.out.println("Is Balance "+ isBalanced(root));
//        System.out.println("Is Balance "+ isBalanceBetter(root).isBalance);
//
//        System.out.println("Insert duplicate Element");
//        insertDuplicateRight(root);
//        insertDuplicateRight(root);
//        printTree(root);



    }
}

// 1 2 3 4 5 6 -1 -1 -1 -1 -1