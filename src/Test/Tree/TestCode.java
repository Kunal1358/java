package Test.Tree;

import java.util.Scanner;

public class TestCode {

    public static TreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter next Node data");
        int rootData= sc.nextInt();
        TreeNode<Integer> root=new TreeNode<>(rootData);

        System.out.println("Enter no of children of "+ rootData );
        int childCount= sc.nextInt();

        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child= takeInput();
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){

        String s=root.data +":";

        for(int i=0;i<root.children.size();i++){
            s+=root.children.get(i).data + ",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void preOrder(TreeNode<Integer> root){

        System.out.print(root.data + " ");

        for(int i=0;i<root.children.size();i++) {
            preOrder(root.children.get(i));
        }
    }

    public static void postOrder(TreeNode<Integer> root){

        for(int i=0;i<root.children.size();i++) {
            postOrder(root.children.get(i));
        }
        System.out.print(root.data + " ");
    }

    public static TreeNode<Integer> takeInputLevelWise(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData= sc.nextInt();

        TreeNode<Integer> root=new TreeNode<>(rootData);
        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();

        pendingNodes.enQueue(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front= null;
            try {
                front = pendingNodes.deQueue();
                System.out.println("Enter no of children of "+ front.data);
                int childCount= sc.nextInt();
                for(int i=0;i<childCount;i++) {
                    System.out.println("Enter " + (i + 1) + " th children of " + front.data);
                    int childData = sc.nextInt();
                    TreeNode<Integer> child = new TreeNode<>(childData);
                    pendingNodes.enQueue(child);
                    front.children.add(child);
                }
            } catch (Exception e) {
               return null;
            }
        }return root;
    }

    public static void PrintLevelWise(TreeNode<Integer> root){

        QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
        pendingNodes.enQueue(root);

        while(!pendingNodes.isEmpty()){

            try {
                TreeNode<Integer> front= pendingNodes.deQueue();
                System.out.print(front.data+ " ");
                for(int i=0;i<front.children.size();i++) {
                    pendingNodes.enQueue(front.children.get(i));
                    System.out.print(front.children.get(i).data);

                    if(i==front.children.size()-1){
                        break;
                    }
                    else {
                        System.out.print(",");
                    }
                }
                System.out.println();
            } catch (Exception e) {
                return;
            }
        }
    }

    public static int numCount(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count=1;

        for(int i=0;i<root.children.size();i++){
            count+=numCount(root.children.get(i));
        }
        return count;
    }

    public static int sumOfNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }

        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=sumOfNodes(root.children.get(i));
        }
        return sum;
    }

    public static int height(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int height=0;

        for(int i=0;i<root.children.size();i++){
            height=Math.max(height,height(root.children.get(i)));
        }
        return height+1;
    }

    public static boolean present;
    public static boolean isPresent(TreeNode<Integer> root , int val){

        if(root==null){
            present=false;
        }
        else if(root.data==val){
            present= true;
        }

        for(int i=0;i<root.children.size();i++){

            isPresent(root.children.get(i),val);
        }
        return present;
    }

    public static int largest(TreeNode<Integer> root){

        if(root==null){
            return Integer.MIN_VALUE;
        }

        int ans=root.data;
        for(int i=0;i<root.children.size();i++){
            int largest=largest(root.children.get(i));
            if(ans<largest){
                ans=largest;
            }
        }
        return ans;
    }

    public static void printAtK(TreeNode<Integer> root,int k){

        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.data + " ");
        }

        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i),k-1);
        }
    }

    static int gtrThanX;
    public static int grtThanX(TreeNode<Integer> root , int x){
        if(root==null){
            return 0;
        }
        else if(root.data>x){
            gtrThanX++;
        }
        for(int i=0;i<root.children.size();i++){
            grtThanX(root.children.get(i),x);
        }
        return gtrThanX;
    }

    public static void main(String[] args) {

        //TreeNode<Integer> root=takeInput();
        TreeNode<Integer> root=takeInputLevelWise();
        print(root);

//        System.out.println("PreOrder Traversal of a tree");
//        preOrder(root);
//        System.out.println();
//
//        System.out.println("PostOrder Traversal of a tree");
//        postOrder(root);
//        System.out.println();

        System.out.println("LevelWise Traversal of a tree");
        PrintLevelWise(root);
        System.out.println();

//        System.out.println("Num of Nodes are " + numCount(root));
//        System.out.println("Sum of Nodes is " + sumOfNodes(root));
//        System.out.println("Height of Tree is " + height(root));
          System.out.println("isPresent " + isPresent(root,9));
          System.out.println("Largest is  " + largest(root));
          printAtK(root,2);
        System.out.println("Gtr than x " + grtThanX(root,1));

    }

}
