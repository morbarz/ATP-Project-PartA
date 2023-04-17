package algorithms.search;
import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

public class SearchableMaze implements ISearchable
{
    private Maze m;
    public SearchableMaze(Maze maze){
        this.m=maze;
    }
    public Astate getStartState()
    {
        return new MazeState(m.startPosition);
    }
    public Astate getGoalState()
    {
        return new MazeState(m.goalPosition);
    }


}

