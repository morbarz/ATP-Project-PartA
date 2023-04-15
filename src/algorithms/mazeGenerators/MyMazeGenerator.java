package algorithms.mazeGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyMazeGenerator extends AMazeGenerator {
    private Maze FullWallM ;
    private List<Position> PositionList ;// List with the position's from algorithm
    @Override
    public Maze generate(int row, int col) {
        //create maze Full of walls
        Maze primaze = new Maze(row, col);//init maze (without walls)


    }
        Position newPosition ;




    public Position getRandomposition(int row, int col) {
        Position randP;
        {
            randP = new Position();
            Random r1 = new Random();
            Random r2 = new Random();
            int randCol;
            int randRow;
            if (col < row) {
                randCol = r1.nextInt(col);
                randRow = r2.nextInt(row);
            } else if (col == row) {
                randCol = r1.nextInt(row);
                randRow = r2.nextInt(row);
            } else {
                randCol = r1.nextInt(col);
                randRow = r2.nextInt(row);

            }
            randP.setColumnIndex(randCol);
            randP.setRowIndex(randRow);
        }
        return randP;
    }
    public Maze FullfillMaze(Maze toF) { //fullfill wall's all over the maze
        for (int i =0 ; i < toF.row ; i ++){
            for (int j=0 ; j<toF.col ; j++){
                toF.maze[i][j]=1;//now with walls
            }

    }
        return toF;
}
public void Markvisit(Position v){ // mark position as visited
        v.isChecked=true;
     }

public boolean checkPosition(int Prow , int Pcol , Maze toC){ // check if this position value is in bound
        return  (Pcol<=toC.col && Prow<=toC.row && Prow>0 && Pcol>0 ) ;
    }
    public void  addneighbor (Position p, Maze pfrom){ // add position neigbor's to PositionList ;
        //add only if position is not yet visited and if position is in bound of maze .
        if(!pfrom.PositionArray[p.getColumnIndex() - 1][p.getRowIndex()].isChecked && checkPosition((p.getColumnIndex() - 1),p.getRowIndex(),pfrom)){
            PositionList.add(pfrom.PositionArray[p.getColumnIndex() - 1][p.getRowIndex()]);}

        if(!pfrom.PositionArray[p.getColumnIndex() + 1][p.getRowIndex()].isChecked&& checkPosition((p.getColumnIndex() + 1),p.getRowIndex(),pfrom))){
            PositionList.add(pfrom.PositionArray[p.getColumnIndex() + 1][p.getRowIndex()]);}

        if(!pfrom.PositionArray[p.getColumnIndex() ][p.getRowIndex()-1].isChecked&& checkPosition(p.getColumnIndex() ,p.getRowIndex()-1,pfrom)){
            PositionList.add(pfrom.PositionArray[p.getColumnIndex() ][p.getRowIndex()-1]);}

        if(!pfrom.PositionArray[p.getColumnIndex() ][p.getRowIndex()+1].isChecked && checkPosition(p.getColumnIndex() ,p.getRowIndex()+1,pfrom)){
            PositionList.add(pfrom.PositionArray[p.getColumnIndex() ][p.getRowIndex()+1]);}
    }
}


