package algorithms.mazeGenerators;
import java.util.Random;
public class SimpleMazeGenerator extends AMazeGenerator {
    @Override
    public Maze generate(int row, int col) {
        Maze newMaze = new Maze();
        newMaze.MazeGenerator(row, col);
        Random random = new Random();
        int randomNUmber = random.nextInt(2);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMaze.maze[i][j] = randomNUmber;
            }
        }

        return newMaze;   }
}
