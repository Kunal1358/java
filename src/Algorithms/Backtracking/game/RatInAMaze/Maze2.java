package Algorithms.Backtracking.game.RatInAMaze;



public class Maze2 {

    public static void ratInMaze(int maze[][]){
        int n=maze.length;
        int path[][]=new int[n][n];
         ratInMazeHelper(maze,0,0,path);

    }

    public static void ratInMazeHelper(int maze[][],int i,int j, int path[][]){

        int n=maze.length;
        if(i==n-1 && j==n-1){
            path[i][j]=1;
            print(path);
            return ;
        }

        // check if i and j is a valid cell

        if(i<0 || i>n-1 || j<0 || j>n-1){
            return;
        }
        if(i<0 || i>n-1 || j<0 || j>n-1 || maze[i][j]==0 || path[i][j]==1){
            return;
        }

        path[i][j]=1;


        // Explore in all direction
        //Top
        ratInMazeHelper(maze,i-1,j,path);
        //Right
        ratInMazeHelper(maze,i,j+1,path);
        // Down
        ratInMazeHelper(maze,i+1,j,path);
        //Left
        ratInMazeHelper(maze,i,j-1,path);

        path[i][j]=0;
    }

    public static void print(int path[][]){
        System.out.println();
        for(int i=0;i<path.length;i++){
            for(int j=0;j<path.length;j++){
                System.out.print(path[i][j]);
            }
          // System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {{1,0,1},{1,1,1},{1,1,1}};
          ratInMaze(maze);
//        boolean pathPossible=ratInMaze(maze);
//        System.out.println(pathPossible);
    }

}
