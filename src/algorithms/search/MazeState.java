package algorithms.search;
import algorithms.mazeGenerators.Position;

public class MazeState extends AState
{
    protected Position p;
    MazeState(Position position)
    {
        super();
        this.p=position;
        p.setp(this.isVisited());
        this.setState("{" + position.getRowIndex() + ","+ p.getColumnIndex() + "}");
        croos = false;
        distance = 0;
    }
    public void setVisited(boolean visited)
    {
        this.visit = visited;
    }
    public boolean isVisited()
    {
        return this.visit;
    }
    public void updateVisited()
    {
        if (this.isVisited())
        {
            p.setp(true);
        }
    }


}
