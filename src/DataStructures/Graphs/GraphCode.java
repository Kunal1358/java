package DataStructures.Graphs;

import java.util.*;

public class GraphCode {

    public static void printDFHelper(int edges[][],int si,boolean visited[]){

        System.out.print(si+ " ");
        visited[si]=true;

        for(int i=0;i<edges.length;i++){
            if(edges[si][i]==1 && !visited[i]){
                printDFHelper(edges,i,visited);
            }
        }

    }

    public static void printDFS(int edges[][]){
        boolean visited[]= new boolean[edges.length];

        for(int i=0;i<edges.length;i++){
            if(!visited[i]){
                printDFHelper(edges,i,visited);
                // System.out.println(); //uncomment this line to add space btw connected edges
            }
        }
    }

    private static void printBFHelper(int[][] edges, int si, boolean[] visited) {

        QueueUsingLL<Integer> q=new QueueUsingLL<>();
        q.enQueue(si);
        visited[si]=true;

        while (!q.isEmpty()){

            int front;
            try {
                front = q.deQueue();
            } catch (Exception e) {
                return;
            }

            System.out.print(front+ " ");
            for(int i=0;i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.enQueue(i);
                    visited[i]=true;
                }
            }

        }

    }

    public static void printBFS(int edges[][]){

        int n=edges.length;
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++) {
           if(!visited[i]){
               printBFHelper(edges, i, visited);
           }
        }

    }

    public static boolean hasPathDFS(int edges[][] , int si, int ei){

        boolean visited[]=new boolean[edges.length];
        return hasPathDFSHelper(edges,si,ei, visited);

    }

    public static boolean hasPathDFSHelper(int edge[][], int si, int ei, boolean visited[]){

        if(edge[si][ei]==1){
            return true;
        }
        visited[si]=true;
        for(int i=0;i< edge.length;i++){
            if(edge[i][si]==1&&!visited[i]){
                if(i==ei){
                    return true;
                }
                hasPathDFSHelper(edge,i,ei,visited);
            }
        }
        return false;
    }

    public static boolean hasPathBFS(int edges[][] , int si, int ei){

        boolean visited[]=new boolean[edges.length];
        return hasPathBFSHelper(edges,si,ei, visited);

    }

    public static boolean hasPathBFSHelper(int edge[][], int si, int ei, boolean visited[]){

        if(edge[si][ei]==1){
            return true;
        }

        QueueUsingLL<Integer> q=new QueueUsingLL<>();
        q.enQueue(si);
        visited[si]=true;

        while (!q.isEmpty()){

            int front;
            try {
                front= q.deQueue();
            } catch (Exception e) {
                return false;
            }

            for(int i=0;i<edge.length;i++){

                if(edge[i][front]==1 && !visited[i]){
                    if(i==ei){
                        return true;
                    }
                    q.enQueue(i);
                    visited[i]=true;
                }
            }
        }
        return false;
    }

    public static ArrayList<Integer> getPathDFS(int [][]edges,int si,int ei){

        boolean visited[]=new boolean[edges.length];
        ArrayList<Integer> path =getPathDFSHelper(edges,si,ei,visited);
        if(path!=null){ // if path is not null return path
            return path;
        }else // return new ArrayList to print [] instead of null
        return new ArrayList<>();
    }

    public static ArrayList<Integer> getPathDFSHelper(int edges[][],int si,int ei,boolean visited[]){

        if(si==ei){
            ArrayList<Integer> path=new ArrayList<>();
            path.add(ei);
            return path;
        }
        visited[si]=true;
        for(int i=0;i<edges.length;i++){
            if(edges[i][si]==1 && !visited[i]){
                ArrayList<Integer> path=getPathDFSHelper(edges,i,ei,visited);
                if(path!=null){
                    path.add(si);
                    return path;
                }
            }
        }
        return null;
    }

    public static ArrayList<Integer> getPathBFS(int [][]edges,int si,int ei){

        boolean visited[]=new boolean[edges.length];
        ArrayList<Integer> path =getPathBFSHelper(edges,si,ei,visited);
        if(path!=null){ // if path is not null return path
            return path;
        }else // return new ArrayList to print [] instead of null
            return new ArrayList<>();
    }

    public static ArrayList<Integer> getPathBFSHelper(int edges[][],int si,int ei,boolean visited[]){

        if(si> edges.length-1 || ei>edges.length-1){
            return null;
        }
        Queue<Integer>q=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        if(si==ei){
            ArrayList<Integer> path=new ArrayList<>();
            path.add(ei);
            return path;
        }

        q.add(si);
        visited[si]=true;

        while(!q.isEmpty()){
            int front=q.poll();

            for(int i=0;i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    map.put(i,front);
                    q.add(i);
                    visited[i]=true;

                    if(i==ei){
                        ArrayList<Integer> path=new ArrayList<>();
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
        }
        return null;
    }

    public static boolean isConnectedDFS(int edges[][]){

        boolean visited[]=new boolean[edges.length];
        isConnectedHelperDFS(edges,0,visited);
        for (int i=0;i< edges.length;i++){
             if(!visited[i]){
                 return false;
             }
        }
        return true;
    }

    public static void isConnectedHelperDFS(int edges[][],int si,boolean visited[]){

        visited[si]=true;

        for(int i=0;i<edges.length;i++){
            if(edges[si][i]==1 && !visited[i]){
                isConnectedHelperDFS(edges,i,visited);
            }
        }
    }

    public static boolean isConnectedBFS(int edges[][]){

        boolean visited[]=new boolean[edges.length];
        isConnectedHelperBFS(edges,0,visited);
        for (int i=0;i< edges.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }

    public static void isConnectedHelperBFS(int edges[][],int si,boolean visited[]){

        QueueUsingLL<Integer> q=new QueueUsingLL<>();
        q.enQueue(si);
        visited[si]=true;

        while (!q.isEmpty()){

            int front;
            try {
                front = q.deQueue();
            } catch (Exception e) {
                return;
            }
            for(int i=0;i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.enQueue(i);
                    visited[i]=true;
                }
            }

        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of vertices");
        int v=sc.nextInt();
        System.out.println("Enter no of edges");
        int e= sc.nextInt();

        int edges[][]=new int[v][v];
        System.out.println("Enter Pairs");
        for(int i=0;i<e;i++){
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            edges[p1][p2]=1;
            edges[p2][p1]=1;
        }

        System.out.println("DFT - Depth First Traversal");
        printDFS(edges);
        System.out.println();

        System.out.println("BFT - Depth First Traversal");
        printBFS(edges);
        System.out.println();

//        System.out.println();
//        System.out.println("is connected DFS " + isConnectedDFS(edges));
//
//        System.out.println();
//        System.out.println("is connected BFS " + isConnectedBFS(edges));

//        System.out.println();
//        System.out.println("Has path");
//        System.out.println(hasPathBFS(edges,0,3));

        System.out.println();
        System.out.println("Printing path DfS");
        ArrayList<Integer> path=getPathDFS(edges,1,3);
        System.out.println(path);

//
        System.out.println();
        System.out.println("Printing path BFS");
        ArrayList<Integer> path2=getPathBFS(edges,1,3);
        System.out.println(path2);



//        while (path!=null){
//            System.out.print(path);
//            break;
//        }


    }

}

/*

6 5
0 1
0 2
1 2
2 3
4 5

4 4
0 1
0 3
1 2
2 3

4 4
0 1
0 2
1 2
2 3

 */