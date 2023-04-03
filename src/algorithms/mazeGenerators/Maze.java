package algorithms.mazeGenerators;

public class Maze {
    int columns;
    int rows;
    int[][] maze;

    public void MazeGenerator(int row, int col) {//constructor
        this.rows = row;
        this.columns = col;
        this.maze = new int[row][col];

    }

    public void Print(Maze MazeToPrint) {

    }


    public Position getStartPosition(Maze Smaze) {
        Position startPosition = new Position();
        startPosition.position(0, 0);
        return startPosition;
    }


    public Position getGoalPosition(Maze Gmaze) {
        Position GoalPosition = new Position();
        GoalPosition.position(this.rows, this.columns);
        return GoalPosition;


    }
}