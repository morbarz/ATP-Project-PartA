package algorithms.mazeGenerators;

public class Position {
    int rowX; // row
    int colY; // columns

    public int getColumnIndex() {
        return colY;
    }
    public int getRowIndex(){
        return rowX;
    }
    public void position(int rowx , int coly){ // constructor
        //Position newP = new Position();
        this.rowX = rowx;
        this.colY = coly;
    }


}
