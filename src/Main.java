import algorithms.mazeGenerators.EmptyMazeGenerator;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.SimpleMazeGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //EmptyMazeGenerator maze1 = new EmptyMazeGenerator();
        //maze1.generate(100,100);
        SimpleMazeGenerator maze1 = new SimpleMazeGenerator();
        maze1.generate(100,100);
        System.out.println(maze1);

    }


}