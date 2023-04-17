package algorithms.search;

import algorithms.mazeGenerators.Position;

public class MazeState extends Astate{
    protected Position p ;
    public MazeState(Position position)
    {
        super();
        this.p=position;
        p.setp(this.isVisited());
        this.setState("{" + position.getRowIndex() + ","+ p.getColumnIndex() + "}");
        cross = false;
        distance = 0;



    }
