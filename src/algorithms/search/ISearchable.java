package algorithms.search;

import java.util.ArrayList;

public interface ISearchable
{
    Astate getStartState();
    Astate getGoalState();
    ArrayList<Astate> getAllPossibleStates(Astate s);
}



