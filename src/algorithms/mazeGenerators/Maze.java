package algorithms.mazeGenerators;

public class Maze
{
    // constructor creates an empty maze[][] & initialize 0's
    public int[][] maze;
    public Position startPosition;
    public Position goalPosition;
    public int row;
    public int col;
    public Position[][] PositionArray;


    public  Maze(int row, int col) {
            try {
                if (row == 0 && col == 0)
                    throw new Exception("can't be  Maze");
            }
            catch (Exception e) {e.getMessage();}

            this.maze = new int[row][col];
            this.PositionArray = new Position[row][col];
            this.startPosition=new Position();
            this.goalPosition = new Position();
            this.startPosition.setColumnIndex(0);
            this.startPosition.setRowIndex(0);
            this.goalPosition.setRowIndex(this.maze.length-1);
            this.goalPosition.setColumnIndex(this.maze[0].length-1);
            //now create default maze with no walls :
            for (int i= 0 ;i<row ; i++){
                for (int j = 0 ; j <col ; j++){
                    this.maze[i][j]=0;
                }
            }


        }




    public void Print(Maze MazeToPrint) {

    }


    public Position getStartPosition(Maze Smaze) {
        return this.startPosition;
    }


    public Position getGoalPosition(Maze Gmaze) {
        return this.goalPosition;


    }
}