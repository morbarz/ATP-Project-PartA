package algorithms.mazeGenerators;
import java.util.*;

import java.util.Random;
public class SimpleMazeGenerator extends AMazeGenerator {
    private Maze m;

    @Override
    public Maze generate(int row, int col) {
        Maze newMaze = new Maze(row, col);
        newMaze.MazeGenerator(row, col);
        Random random = new Random();
        int randomNUmber = random.nextInt(2);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMaze.maze[i][j] = randomNUmber;
                randomNUmber = random.nextInt(2);

            }
        }

        return newMaze;   }
        private int rows;
        private int cols;
        private int[][] maze;

//       public SimpleMazeGenerator(int rows, int cols) {
//           m = new Maze(rows,cols);
//           m.MazeGenerator(rows,cols);
//       }
////            this.rows = rows;
////            this.cols = cols;
////            this.maze = new int[rows][cols];
////        }
//
//        public Maze generate(int rows, int cols) {
//            {
//                Stack<int[]> stack = new Stack<>();
//                boolean[][] visited = new boolean[rows][cols];
//
//                int[] start = new int[]{0, 0};
//                stack.push(start);
//
//                while (!stack.isEmpty()) {
//                    int[] current = stack.pop();
//                    int row = current[0];
//                    int col = current[1];
//
//                    if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col]) {
//                        continue;
//                    }
//
//                    visited[row][col] = true;
//
//                    int[][] neighbors = new int[][]{{row + 1, col}, {row - 1, col}, {row, col + 1}, {row, col - 1}};
//                    shuffleArray(neighbors);
//
//                    for (int[] neighbor : neighbors) {
//                        int nrow = neighbor[0];
//                        int ncol = neighbor[1];
//
//                        if (!visited[nrow][ncol]) {
//                            if (nrow == row + 1) {
//                                m.maze[row][col] |= 1;
//                                m.maze[nrow][ncol] |= 1;
//                            } else if (nrow == row - 1) {
//                                m.maze[row][col] |= 1;
//                                m.maze[nrow][ncol] |= 1;
//                            } else if (ncol == col + 1) {
//                                m.maze[row][col] |= 1;
//                                m.maze[nrow][ncol] |= 1;
//                            } else if (ncol == col - 1) {
//                                m.maze[row][col] |= 8;
//                                m.maze[nrow][ncol] |= 2;
//                            }
//
//                            stack.push(neighbor);
//                        }
//                    }
//                }
//            }
//            return null;
//        }
//
//        public void display() {
//            for (int col = 0; col < m.columns; col++) {
//                System.out.print("_");
//            }
//            System.out.println();
//
//            for (int row = 0; row < m.rows; row++) {
//                System.out.print("|");
//                for (int col = 0; col < m.columns; col++) {
//                    if ((m.maze[row][col] & 1) != 0) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("_");
//                    }
//
//                    if ((m.maze[row][col] & 2) != 0) {
//                        System.out.print(" ");
//                    } else {
//                        System.out.print("|");
//                    }
//                }
//                System.out.println();
//            }
//        }
//
//        private void shuffleArray(int[][] arr) {
//            Random rnd = new Random();
//            for (int i = arr.length - 1; i > 0; i--) {
//                int index = rnd.nextInt(i + 1);
//                int[] temp = arr[index];
//                arr[index] = arr[i];
//                arr[i] = temp;
//            }
//        }
//
//

}







