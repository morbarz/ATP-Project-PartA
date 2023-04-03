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
        System.out.println("{"+ this.rows +"," + this.columns + "}" );

    }

    public Position getStartPosition(Maze Smaze) {

    }

    public Position getGoalPosition(Maze Gmaze) {


    }
}

