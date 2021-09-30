package Test.DS.Trees;

import java.util.Scanner;

public class TreeUse {

    public static TreeNode<Integer> takeInput(Scanner sc){

        System.out.println("Enter next Node data");
        int nodeData= sc.nextInt();
        TreeNode<Integer> root=new TreeNode<>(nodeData);
        System.out.println("Enter no of children of "+ nodeData);
        int childSize= sc.nextInt();
        for(int i=0;i<childSize;i++){
            TreeNode<Integer> child=takeInput(sc);
            root.children.add(child);
        }
        return root;
    }

    public static void printTree(TreeNode<Integer> root){

        String s=root.data+" : ";
        for(int i=0;i<root.children.size();i++){
            s+=root.children.get(i).data+",";
        }
        System.out.println(s);

        for(int i=0;i<root.children.size();i++){
            printTree(root.children.get(i));
        }

    }

    public static TreeNode<Integer> takeInputLevelWise() throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData= sc.nextInt();

        TreeNode<Integer> root=new TreeNode<>(rootData);
        QueueUsingLL<TreeNode<Integer>> queue=new QueueUsingLL<>();

        queue.enQueue(root);
        while (!queue.isEmpty()){

            TreeNode<Integer> front= queue.deQueue();
            System.out.println("Enter no of children of "+ front.data);
            int numChild= sc.nextInt();
            for(int i=0;i<numChild;i++) {
                System.out.println("Enter " + (i + 1) + "th child of " + front.data);
                int childData = sc.nextInt();
                TreeNode<Integer> child = new TreeNode<>(childData);
                queue.enQueue(child);
                front.children.add(child);
            }
        }
        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root) throws Exception {

        QueueUsingLL<TreeNode<Integer>> queue=new QueueUsingLL<>();

        queue.enQueue(root);
        while (!queue.isEmpty()){

            TreeNode<Integer> front= queue.deQueue();
            System.out.print(front.data+":");
            for(int i=0;i<front.children.size();i++) {
                System.out.print(front.children.get(i).data);
                queue.enQueue(front.children.get(i));

                if(i==root.children.size()-1){
                    break;
                }else {
                    System.out.print(",");
                }

            }
            System.out.println();
        }
    }

    public static void preOrder(TreeNode<Integer> root){

        System.out.print(root.data+" ");
        for(int i=0;i<root.children.size();i++){
            preOrder(root.children.get(i));
        }
    }

    public static void postOrder(TreeNode<Integer> root){

        for(int i=0;i<root.children.size();i++){
            postOrder(root.children.get(i));
        }
        System.out.print(root.data+" ");
    }

    public static int countNodes(TreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int count=1;

        for(int i=0;i<root.children.size();i++){
            count+=countNodes(root.children.get(i));
        }
        return count;

    }

    public static int count;

    public static int countLeafNodes(TreeNode<Integer> root){

        if(root.children.size()==0){
            count++;
        }
        for(int i=0;i<root.children.size();i++){
            countLeafNodes(root.children.get(i));
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

    public static int sum(TreeNode<Integer> root){

        if(root==null){
            return 0;
        }
        int sum=root.data;

        for(int i=0;i<root.children.size();i++){
            sum+=sum(root.children.get(i));
        }
        return sum;
    }

    public static void printAtK(TreeNode<Integer> root,int k){

        if(k==0){
            System.out.print( root.data+" ");
            return;
        }
        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i),k-1);
        }

    }

    public static boolean isPresent=false;
    public static boolean isXPresent(TreeNode<Integer> root, int x){

        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        for(int i=0;i< root.children.size();i++){
            isXPresent(root.children.get(i),x);
        }
        return isPresent;
    }

    public static int greaterThanX;
    public static int valuesGetGreaterThanX(TreeNode<Integer> root,int x){

        if(root==null){
            return 0;
        }
        if(root.data>=x){
            greaterThanX++;
            System.out.print(root.data+",");
        }
        for(int i=0;i< root.children.size();i++){
            valuesGetGreaterThanX(root.children.get(i),x);
        }
        return greaterThanX;

    }







    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
//
          TreeNode<Integer> root=takeInput(sc);
//        TreeNode<Integer> root=takeInputLevelWise();

//        printLevelWise(root);
//        System.out.println();

//        printTree(root);
//        System.out.println();

        System.out.println();
        System.out.println("Print statements");
        System.out.println("No of nodes are: "+ countNodes(root));
        System.out.println("No of Leaf nodes are: "+ countLeafNodes(root));
        System.out.println("largest: "+ largest(root));
        System.out.println("Height: "+ height(root));
        System.out.println("sum: "+ sum(root));
        System.out.println("Is present: "+ isXPresent(root,9));
        System.out.println("Values Greater Than x: "+ valuesGetGreaterThanX(root,1));

        System.out.println();
        printAtK(root,1);


//        System.out.println("pre Order");
//        preOrder(root);
//        System.out.println();
//
//        System.out.println("Post Order");
//        postOrder(root);
//        System.out.println();

    }

}

// 1 3 2 0 3 1 5 0 4 0

