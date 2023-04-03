package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends AMazeGenerator{
    @Override
    public Maze generate(int row, int col) { //create Maze with mazegenerator
        Maze newMaze = new Maze();
        newMaze.MazeGenerator(row, col);
        for (int i = 0 ; i<row ; i++){
            for (int j = 0 ; j<col ; j++){
                newMaze.maze[i][j]=0; // create maze without walls
            }
        }
        return newMaze;
    }



}
