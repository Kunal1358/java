package DataStructures.Graphs;

import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

import java.util.*;

public class Code {

    public static void printDFS(int edges[][]){
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                printDFSHelper(edges,i,visited);
                System.out.println();
            }
        }
    }

    public static void printDFSHelper(int edges[][],int si,boolean visited[]){

        System.out.print(si + " ");
        visited[si]=true;

        for(int i=0;i<edges.length;i++){
            if(edges[si][i]==1 && !visited[i]){
                printDFSHelper(edges,i,visited);
            }
        }

    }

    public static void printBFS(int edges[][]){
        boolean visited[]=new boolean[edges.length];
        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                printBFSHelper(edges,i,visited);
            }
        }
    }

    public static void printBFSHelper(int edges[][],int si,boolean visited[]){

        QueueUsingLL<Integer> queue =new QueueUsingLL<>();
        queue.enQueue(si);
        visited[si]=true;

        while(!queue.isEmpty()){
            int front;
            try {
                front= queue.deQueue();
            } catch (Exception e) {
                return;
            }
            System.out.print(front+" ");
            for(int i=0;i< edges.length;i++){
                if(edges[i][front]==1 && !visited[i]){
                    queue.enQueue(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static boolean isConnectedDFS(int edges[][]){
        boolean visited[]=new boolean[edges.length];
        isConnectedDFSHelper(edges,0,visited);

        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }

    public static void isConnectedDFSHelper(int edges[][],int si,boolean visited[]){

        visited[si]=true;

        for(int i=0;i<edges.length;i++){
            if(edges[si][i]==1 && !visited[i]){
                isConnectedDFSHelper(edges,i,visited);
            }
        }
    }

    public static boolean isConnectedBFS(int edges[][]){

        boolean visited[]=new boolean[edges.length];
        isConnectedBFSHelper(edges,0,visited);

        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }

    public static void isConnectedBFSHelper(int edges[][],int si,boolean visited[]){

        QueueUsingLL<Integer> queue =new QueueUsingLL<>();
        queue.enQueue(si);
        visited[si]=true;

        while(!queue.isEmpty()){
            int front;
            try {
                front= queue.deQueue();
            } catch (Exception e) {
                return;
            }
            for(int i=0;i< edges.length;i++){
                if(edges[i][front]==1 && !visited[i]){
                    queue.enQueue(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static boolean hasPathDFS(int edges[][],int si,int ei){

        boolean visited[]=new boolean[edges.length];
        return hasPathDFSHelper(edges,si,ei,visited);
    }

    public static boolean hasPathDFSHelper(int edge[][],int si,int ei,boolean visited[]){

        if(edge[si][ei]==1){
            return true;
        }
        visited[si]=true;
        for(int i=0;i< edge.length;i++){
            if(edge[i][si]==1&&!visited[i]){
                if(edge[i][ei]==1 && !visited[i]){ // other Logic
                    return true;
                }
//                if(i==ei){ // Code not working
//                    return true;
//                }
                hasPathDFSHelper(edge,i,ei,visited);
            }
        }
        return false;

    }

    public static boolean hasPathBFS(int edges[][],int si,int ei){

        if(si==ei){
            return true;
        }

        boolean visited[]=new boolean[edges.length];
        return hasPathBFSHelper(edges,si,ei,visited);
    }

    public static boolean hasPathBFSHelper(int edges[][],int si,int ei,boolean visited[]){

        if(edges[si][ei]==1){
            return true;
        }

        QueueUsingLL<Integer> queue =new QueueUsingLL<>();
        queue.enQueue(si);
        visited[si]=true;

        while(!queue.isEmpty()){
            int front;
            try {
                front= queue.deQueue();
            } catch (Exception e) {
                return false;
            }

            for(int i=0;i< edges.length;i++){
                if(edges[i][front]==1 && !visited[i]){

                    if(i==ei){
                        return true;
                    }

                    queue.enQueue(i);
                    visited[i]=true;
                }
            }
        }return false;
    }

    public static ArrayList<Integer> getPathDFS(int edge[][],int si,int ei){
        boolean vivisted[]=new boolean[edge.length];
        ArrayList<Integer>path=getPathDFSHelper(edge,si,ei,vivisted);
        if(path!=null){
            return path;
        }else {
            return new ArrayList<>();
        }
    }

    public static ArrayList<Integer> getPathDFSHelper(int edge[][],int si,int ei,boolean visited[]){

        if(si==ei){
            ArrayList<Integer>path=new ArrayList<>();
            path.add(ei);
            return path;
        }
        visited[si]=true;

        for(int i=0;i<edge.length;i++){
            if(edge[i][si]==1 && !visited[i]){
                ArrayList<Integer> path=getPathDFSHelper(edge,i,ei,visited);
                if(path!=null){
                    path.add(si);
                    return path;
                }
            }
        }return null;
    }

    public static ArrayList<Integer> getPathBFS(int edge[][],int si,int ei){
        boolean vivisted[]=new boolean[edge.length];
        ArrayList<Integer>path=getPathBFSHelper(edge,si,ei,vivisted);
        if(path!=null){
            return path;
        }else {
            return new ArrayList<>();
        }
    }

    public static ArrayList<Integer> getPathBFSHelper(int edge[][],int si,int ei,boolean visited[]){

        if(si> edge.length-1 || ei > edge.length-1){
            return null;
        }

        Queue<Integer> q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        if(si==ei){
            ArrayList<Integer>path=new ArrayList<>();
            path.add(ei);
            return path;
        }

        q.add(si);
        visited[si]=true;

        while(!q.isEmpty()){

            int front=q.poll();
            for(int i=0;i< edge.length;i++){
                if(edge[front][i]==1 && !visited[i]){
                    map.put(i,front);
                    q.add(i);
                    visited[i]=true;

                    if(i==ei){
                        ArrayList<Integer>path=new ArrayList<>();
                        path.add(ei);

                        int value=map.get(ei);
                        while(value!=si){
                            path.add(value);
                            value=map.get(value);
                        }
                        path.add(value);
                        return path;
                    }
                }
            }
        }return null;
    }

    public static ArrayList<ArrayList<Integer>> printConnectedComponents(int edges[][]){

        boolean visited[]=new boolean[edges.length];
        ArrayList<ArrayList<Integer>> bigPath=new ArrayList<>();

        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                ArrayList<Integer> path=printConnectedComponentsHelper(edges,i,visited);
                System.out.println("Inside Func  "+ path);
                bigPath.add(path);
            }
        }return bigPath;

    }

    public static ArrayList<Integer> printConnectedComponentsHelper(int edges[][],int si,boolean visited[]){

        ArrayList<Integer> path=new ArrayList<>();
        path.add(si);
        visited[si]=true;

        for(int i=0;i< edges.length;i++){
            if(edges[i][si]==1 && !visited[i]){
                path.add(i);
                printConnectedComponentsHelper(edges,i,visited);
            }
        }return path;

    }




    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Vertices");
        int vertices= sc.nextInt();
        System.out.println("Enter no of Edges");
        int edge=sc.nextInt();
        System.out.println("Enter pairs");

        int edges[][]=new int[vertices][vertices];
        for(int i=0;i<edge;i++){
            int v1= sc.nextInt();
            int v2=sc.nextInt();
            edges[v1][v2]=1;
            edges[v2][v1]=1;
        }

//        System.out.println();
//        System.out.println("Printing path DFS");
//        printDFS(edges);
//
//        System.out.println();
//        System.out.println("Printing path BFS");
//        printBFS(edges);

        System.out.println();
        System.out.println("Print All Connected Components DFS");
        ArrayList<ArrayList<Integer>> components=printConnectedComponents(edges);
        System.out.println(components);
//
//        for (int i = 0; i < edges.length; i++) {
//            for (int j = 0; j < components[i].size(); j++) {
//                System.out.print(components[i].get(j) + " ");
//            }
//            System.out.println();
//        }

//        System.out.println();
//        System.out.println("printing path DFS");
//        ArrayList<Integer> path= getPathDFS(edges,1,3);
//        System.out.println(path);
//
//        System.out.println();
//        System.out.println("printing path BFS");
//        ArrayList<Integer> path2= getPathBFS(edges,1,3);
//        System.out.println(path2);
//

//        System.out.println();
//        System.out.println();
//        System.out.println("Is Connected DFS "+ isConnectedDFS(edges));
//
//        System.out.println();
//        System.out.println("Is Connected BFS "+ isConnectedBFS(edges));
//
//        System.out.println();
//        System.out.println("Has path DFS "+ hasPathDFS(edges,1,3));
//
//        System.out.println();
//        System.out.println("Has path BFS "+ hasPathBFS(edges,1,3));


    }

}


/*

6 5
0 1
0 2
1 2
2 3
4 5

 */