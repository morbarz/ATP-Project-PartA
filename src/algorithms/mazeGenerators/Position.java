package algorithms.mazeGenerators;

public class Position {
    int rowX; // row
    int colY; // columns
    public  Position(int rowx , int coly){ // constructor
        //Position newP = new Position();
        this.rowX = rowx;
        this.colY = coly;
    }
    public int getColumnIndex() {
        return colY;
    }
    public int getRowIndex(){
        return rowX;
    }

    @Override
    public String toString(){
        return "{" + getRowIndex() + " , "+ getColumnIndex() + "}";
    }


}
