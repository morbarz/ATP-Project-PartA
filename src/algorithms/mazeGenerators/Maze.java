package algorithms.mazeGenerators;

public class Maze {
    int columns;
    int rows;
    int[][] maze;
    public Maze(int row, int col) {//constructor
        this.rows = row;
        this.columns = col;
        this.maze = new int[row][col];
    }

        public Maze MazeGenerator(int row, int col) {
            Maze newMaze = new Maze(row,col);
            return newMaze;

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