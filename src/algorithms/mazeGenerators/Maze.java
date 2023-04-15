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

        public void Maze(int row, int col) {
            try {
                if (row == 0 && col == 0)
                    throw new Exception("can't be  Maze");
            }
            catch (Exception e) {e.getMessage();}
            this.maze = new int[row][col];
            this.PositionArray = new Position[row][col];
            this.startPosition=new Position();
            this.goalPosition = new Position();
            this.row=row;
            this.col=col;


        }




    public void Print(Maze MazeToPrint) {

    }


    public Position getStartPosition(Maze Smaze) {
        Position startPosition = new Position(0,0);
        return startPosition;
    }


    public Position getGoalPosition(Maze Gmaze) {
        Position GoalPosition = new Position(this.rows, this.columns);
        return GoalPosition;


    }
}