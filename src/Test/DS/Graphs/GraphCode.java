package Test.DS.Graphs;

import java.util.*;

public class GraphCode {

    public static void printDFS(int edges[][]){
        boolean visited[]=new boolean[edges.length];

        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                printDFSHelper(edges,i,visited);
                System.out.println();
            }
        }
    }

    private static void printDFSHelper(int[][] edges, int si, boolean[] visited) {

        System.out.print(si+" ");
        visited[si]=true;

        for(int i=0;i< edges.length;i++){
            if(edges[i][si]==1 && !visited[i]){
                printDFSHelper(edges,i,visited);
            }
        }
    }

    public static void printBFS(int edges[][]) throws Exception {
        boolean visited[]=new boolean[edges.length];

        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                printBFSHelper(edges,i,visited);
                System.out.println();
            }
        }
    }

    private static void printBFSHelper(int[][] edges, int si, boolean[] visited) throws Exception {

        QueueUsingLL<Integer> queue=new QueueUsingLL<>();
        queue.enQueue(si);
        visited[si]=true;


        while(!queue.isEmpty()){

            int front= queue.deQueue();
            System.out.print(front+" ");

            for(int i=0;i< edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    queue.enQueue(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static boolean hasPathDFS(int edges[][],int si,int ei){
        boolean visited[]=new boolean[edges.length];
        return hasPathDFSHelper(edges, si,ei, visited);
    }

    private static boolean hasPathDFSHelper(int[][] edges, int si,int ei, boolean[] visited) {

        if(edges[si][ei]==1){
            return true;
        }

        visited[si]=true;
        for(int i=0;i< edges.length;i++){
            if(edges[i][si]==1 && !visited[i]){
                if(edges[i][ei]==1 && !visited[i]){
                    return true;
                }
                hasPathDFSHelper(edges,i,ei,visited);
            }
        }
        return false;
    }

    public static boolean hasPathBFS(int edges[][],int si,int ei) throws Exception {
        boolean visited[]=new boolean[edges.length];
        return hasPathBFSHelper(edges, si,ei, visited);
    }

    private static boolean hasPathBFSHelper(int[][] edges, int si, int ei, boolean[] visited) throws Exception {

        if(edges[si][ei]==1){
            return true;
        }

        QueueUsingLL<Integer> queue=new QueueUsingLL<>();
        queue.enQueue(si);
        visited[si]=true;

        while (!queue.isEmpty()){
            int front= queue.deQueue();

            for(int i=0;i<edges.length;i++){
                if(edges[i][front]==1 && !visited[i]){

                    if(i==ei){
                        return true;
                    }
                    queue.enQueue(i);
                    visited[i]=true;
                }
            }
        }
      return false;
    }

    public static boolean isConnectedDFS(int edges[][]){

        boolean visited[]=new boolean[edges.length];
        isConnectedDFSHelper(edges,0,visited);

        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }

    public static void isConnectedDFSHelper(int edges[][],int si,boolean visited[]){

        visited[si]=true;
        for(int i=0;i<edges.length;i++){
            if(edges[i][si]==1 && !visited[i]){
                isConnectedDFSHelper(edges,i,visited);
            }
        }
    }

    public static boolean isConnectedBFS(int edges[][]) throws Exception {

        boolean visited[]=new boolean[edges.length];
        isConnectedBFSHelper(edges,0,visited);

        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }

    private static void isConnectedBFSHelper(int[][] edges, int si, boolean[] visited) throws Exception {

        QueueUsingLL<Integer> queue=new QueueUsingLL<>();
        queue.enQueue(si);
        visited[si]=true;

        while(!queue.isEmpty()){

            int front= queue.deQueue();
            for(int i=0;i< edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    queue.enQueue(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static ArrayList<Integer> printPathDFS(int edges[][],int si,int ei){

        boolean visited[]=new boolean[edges.length];
        ArrayList<Integer> path= getPathDFSHelper(edges,si,ei,visited);
        return path;
    }

    private static ArrayList<Integer> getPathDFSHelper(int[][] edges, int si, int ei, boolean[] visited) {

        if(si==ei){
            ArrayList<Integer> path=new ArrayList<>();
            path.add(ei);
            return path;
        }

        visited[si]=true;

        for(int i=0;i< edges.length;i++){
            if(edges[i][si]==1 && !visited[i]){
                    ArrayList<Integer> path = getPathDFSHelper(edges, i, ei, visited);
                    if (path != null) {
                        path.add(si);
                        return path;
                    }
            }
        }return null;
    }

    public static ArrayList<Integer> printPathBFS(int edges[][],int si,int ei) throws Exception {

        boolean visited[]=new boolean[edges.length];
        ArrayList<Integer> path= getPathBFSHelper(edges,si,ei,visited);
        return path;
    }

    private static ArrayList<Integer> getPathBFSHelper(int[][] edges, int si, int ei, boolean[] visited) throws Exception {

        if(si> edges.length-1 || ei> edges.length-1){
            return null;
        }
        QueueUsingLL<Integer> queue=new QueueUsingLL<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        if(si==ei){
            ArrayList<Integer> path=new ArrayList<>();
            path.add(ei);
            return path;
        }

        queue.enQueue(si);
        visited[si]=true;

        while (!queue.isEmpty()){

            int front= queue.deQueue();

            for(int i=0;i< edges.length;i++){

                if(edges[front][i]==1 && !visited[i]){
                    map.put(i,front);
                    queue.enQueue(i);
                    visited[i]=true;

                    if(i==ei) {
                        ArrayList<Integer> path = new ArrayList<>();
                        path.add(ei);

                        int value = map.get(ei);
                        while (value != si) {
                            path.add(value);
                            value = map.get(value);
                        }
                        path.add(value);
                        return path;
                    }
                }
            }
        }return null;
    }

    public static ArrayList<ArrayList<Integer>> ReturnAllConnectedComponents(int edges[][]){

        boolean visited[]=new boolean[edges.length];
        ArrayList<ArrayList<Integer>> output=new ArrayList<>();

        for(int i=0;i< edges.length;i++){
            if(!visited[i]){
                ArrayList<Integer> smallAns=new ArrayList<>();
                connectedComponentHelper(edges,i,visited,smallAns);
                output.add(smallAns);
            }
        }
        return output;
    }

    private static void connectedComponentHelper(int[][] edges, int si, boolean[] visited, ArrayList<Integer> list) {

        list.add(si);
        visited[si]=true;

        for(int i=0;i< edges.length;i++){
            if(i==si){
                continue;
            }
            if(edges[i][si]==1 && !visited[i]){
                connectedComponentHelper(edges,i,visited,list);
            }
        }
    }


    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertices");
        int vertices= sc.nextInt();
        int edges[][]=new int[vertices][vertices];

        System.out.println("Enter no of Edges");
        int noOfPairs= sc.nextInt();
        System.out.println("Enter pairs");

        for(int i=0;i<noOfPairs;i++){
            int p1= sc.nextInt();
            int p2= sc.nextInt();
            edges[p1][p2]=1;
            edges[p2][p1]=1;
        }

        System.out.println("Printing DFT of Graph");
        printDFS(edges);

        System.out.println("Printing BFT of Graph");
        printBFS(edges);

//        System.out.println();
//        System.out.println("Has Path: "+ hasPathDFS(edges,1,4));
//
//        System.out.println();
//        System.out.println("Has Path: "+ hasPathBFS(edges,1,4));

//        System.out.println();
//        System.out.println("Is Connected DFS: "+ isConnectedDFS(edges));
//
//        System.out.println();
//        System.out.println("Is Connected BFS: "+ isConnectedBFS(edges));

//        System.out.println();
//        System.out.println("Printing path DfS");
//        ArrayList<Integer> path=printPathDFS(edges,0,3);
//        System.out.println(path);

//        System.out.println();
//        System.out.println("Printing path BfS");
//        ArrayList<Integer> path2=printPathBFS(edges,0,3);
//        System.out.println(path2);
//

        System.out.println("Printing All Connected Components");
        ArrayList<ArrayList<Integer>>output= ReturnAllConnectedComponents(edges);

        System.out.println(output);

//        for(int i=0;i< output.size();i++){
//            Collections.sort(output.get(i));
//        }
//
//        for (int i = 0; i < output.size(); i++) {
//            for (int j = 0; j < output.get(i).size(); j++) {
//                System.out.print(output.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }





    }

}
/*

4 4
0 1
0 2
1 2
2 3

6 5
0 1
0 2
1 2
2 3
4 5

 */