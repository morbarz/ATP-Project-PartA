package algorithms.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class DepthFirstSearch extends ASearchingAlgorithm {

    private Stack<AState> stack;
    private HashMap<String, Boolean> marked;

    public DepthFirstSearch() {
        this.name = "DepthFirstSearch";
        this.stack = new Stack<>();
        this.marked = new HashMap<>();
    }
    @Override
    public AState search(ISearchable s) {
        AState start = s.getStartState();
        AState goal = s.getGoalState();
        start.setIsvisited();
        stack.push(start);
        while (!stack.isEmpty()){
         if (start.getState()==goal.getState()){
             return start;
         }
         else {
             stack.pop();

             stack.push()
         }
        }





    }

    @Override
    public int getNumberOfNodesEvaluated() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
