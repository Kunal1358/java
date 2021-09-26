package Algorithms.Backtracking.game.RatInAMaze;

public class ratMaze {

    public static boolean ratInMaze(int maze[][]){
        int n=maze.length;
        int path[][]=new int[n][n];
        return ratInMazeHelper(maze,0,0,path);

    }

    public static boolean ratInMazeHelper(int maze[][],int i,int j, int path[][]){

        // check if i and j is a valid cell
        int n=maze.length;
        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return false;
        }

        path[i][j]=1;
        if(i==n-1 && j==n-1){

            for(int a=0;a<n;a++){
                for(int b=0;b<n;b++){
                    System.out.print(path[a][b]+" ");
                }
                System.out.println();
            }

            return true;
        }

        // Explore in all direction
        //Top
        if(ratInMazeHelper(maze,i-1,j,path)){
            return true;
        }
        //Right
        if(ratInMazeHelper(maze,i,j+1,path)){
            return true;
        }
        // Down
        if(ratInMazeHelper(maze,i+1,j,path)){
            return true;
        }
        //Left
        if(ratInMazeHelper(maze,i,j-1,path)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
        boolean pathPossible=ratInMaze(maze);
        System.out.println(pathPossible);

    }

}
