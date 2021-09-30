package DataStructures.Trees.CodingNinjas.Trees;

import java.util.Scanner;

public class Code {
    public static int count;

//    public static TreeNode<Integer> takeInput(){
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the next Node data");
//        int data=sc.nextInt();
//
//        TreeNode<Integer> root=new TreeNode<>(data);
//        System.out.println("Enter no of children of "+ data);
//        int childCount= sc.nextInt();
//
//        for(int i=0;i<childCount;i++){
//            TreeNode<Integer> child=takeInput();
//            root.children.add(child);
//        }
//        return root;
//
//    }

    public static TreeNode<Integer> takeInput(Scanner sc){

        System.out.println("Enter the next Node data");
        int data=sc.nextInt();

        TreeNode<Integer> root=new TreeNode<>(data);
        System.out.println("Enter no of children of "+ data);
        int childCount= sc.nextInt();

        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child=takeInput(sc);
            root.children.add(child);
        }
        return root;

    }

    public static void print(TreeNode<Integer> root){
        String s=root.data + ":";

        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data + ",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }

    }

    public static TreeNode<Integer> takeInputLevelWise(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData= sc.nextInt();

        TreeNode<Integer> root=new TreeNode<>(rootData);
        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();

        pendingNodes.enQueue(root);

        while(!pendingNodes.isEmpty()){

            try {

                TreeNode<Integer> frontNode= pendingNodes.deQueue();
                System.out.println("Enter no of children of "+ frontNode.data);
                int numCount= sc.nextInt();

                for(int i=0;i<numCount;i++){
                    System.out.println("Enter "+ (i+1)+ " th node data of " +frontNode.data);
                    int child=sc.nextInt();

                    TreeNode<Integer> childNode=new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enQueue(childNode);
                }

            } catch (Exception e) {
                // this should not come as we are checking empty condition in loop itself
                return null;
            }
        }
        return root;
    }

    public static int numCount(TreeNode<Integer> root){

        if(root==null){ // not a base its an edge case
            return 0;
        }

        int count=1;

        for(int i=0;i<root.children.size();i++){ // no need of base case as loop is checking for < 0
            count+=numCount(root.children.get(i));
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root){

        if(root==null){
            return Integer.MIN_VALUE;
        }

        int ans=root.data;

        for(int i=0;i<root.children.size();i++){
            int childLargest=largest(root.children.get(i));
            if(childLargest>ans){
                ans=childLargest;
            }
        }return ans;
    }

    // printDFS all nodes at depth k
    public static void printAtK(TreeNode<Integer> root, int k){
        if(k<0)
            return;
        if(k==0){
            System.out.print(root.data+ " ");
            return;
        }

        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i),k-1);
        }
    }

    public static int heightOfTree(TreeNode<Integer> root){

        if(root==null){
            return Integer.MIN_VALUE;
        }

        int height=0;
        for(int i=0;i<root.children.size();i++){
            height=Math.max(height,heightOfTree(root.children.get(i)));
        }
        return height+1;

    }

    public static int countLeafNodes(TreeNode<Integer> root){

        if(root.children.size()==0) {
            count++;
        }
            for (int i = 0; i < root.children.size(); i++) {
                countLeafNodes(root.children.get(i));
            }

        return count;
    }

    public static void printLevelWise(TreeNode<Integer> root) throws Exception {

        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        pendingNodes.enQueue(root);

        while(!pendingNodes.isEmpty()){

            TreeNode<Integer> frontNode= pendingNodes.deQueue();
            if(frontNode!=null){
                System.out.print(frontNode.data+ ":");

                for(int i=0;i<frontNode.children.size();i++){
                    pendingNodes.enQueue(frontNode.children.get(i));
                    System.out.print(frontNode.children.get(i).data);

                    if(i==frontNode.children.size()-1){
                        break;
                    } else {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }

    }

    public static void preOrder(TreeNode<Integer> root){

        if(root==null) // Edge case
            return;

        System.out.print(root.data +" ");

        for(int i=0;i<root.children.size();i++){
            preOrder(root.children.get(i));
        }

    }

    public static void postOrder(TreeNode<Integer> root){

        if(root==null) // Edge case
            return;

        for(int i=0;i<root.children.size();i++){
            postOrder(root.children.get(i));
        }
        System.out.print(root.data +" ");

    }

    public static int sumOfAllNodes(TreeNode<Integer> root){

        if(root==null) // Edge Case
            return 0;

        int ans=root.data;

        for(int i=0;i< root.children.size();i++){
            ans+=sumOfAllNodes(root.children.get(i));
        }
        return ans;

    }

    public static int countGtrthanX;
    public static int nodesGreaterThanX(TreeNode<Integer> root,int x){

        if(root==null) // Edge Case
            return 0;
        else if(root.data>x){
            countGtrthanX++;
            System.out.print(root.data+ " , ");
        }
        for(int i=0;i< root.children.size();i++){
            nodesGreaterThanX(root.children.get(i),x);
        }
        return countGtrthanX;
    }

    public static boolean present=false;
    public static boolean isPresent(TreeNode<Integer> root,int x){

        if(root==null)
            present=false;
        else if(root.data==x){
            present=true;
        }
        for(int i=0;i< root.children.size();i++){
            isPresent(root.children.get(i),x);
        }
        return present;

    }


    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        //Uncomment QuickSortCode above
        //TreeNode<Integer> root=takeInput();

//        recursively
        TreeNode<Integer> root=takeInput(sc);
        print(root);

        System.out.println();
        System.out.println(heightOfTree(root));

        // level Wise
//        TreeNode<Integer> root=takeInputLevelWise();

        //System.out.println("Printing Tree ");
        //printDFS(root);
//
//        System.out.println("No of nodes is "+ numCount(root));
//
//        System.out.println("Largest is "+ largest(root));

//        System.out.println("Height of the tree is : "+ heightOfTree(root));
//
//        System.out.println("No of leaf Nodes are : "+ countLeafNodes(root));

//        System.out.println("preorder Traversal of a tree");
//        postOrder(root);

//          System.out.println("Level Wise Traversal of a tree");
//          printLevelWise(root);

//        System.out.println("Post Order Traversal of a tree");
//        postOrder(root);
//        System.out.println();

        //Sum of all Nodes
        //System.out.println("Sum of All Nodes = " + sumOfAllNodes(root));

//        System.out.println("Number greater than x is ");
//        int numGtrThanX = nodesGreaterThanX(root,3);
//        System.out.println();
//        System.out.println("Number greater then given value is = " + numGtrThanX);

//        Check if tree contains x
//        System.out.println("Check if tree contains x");
//        System.out.println(isPresent(root,4));




    }

}


// 4 3 2 0 3 1 6 0 5 0