package algorithms.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class BestFirstSearch extends BreadthFirstSearch {
    private PriorityQueue<AState> pq;
    private HashMap<String, Boolean> marked;

    public BestFirstSearch() {
        this.pq = new PriorityQueue<>(new theComparator());
        this.name = "BestFirstSearch";
        this.marked = new HashMap<>();
    }


    public AState search(ISearchable s) {
        AState start = s.getStartState();
        AState goal = s.getGoalState();

        this.getQueue().add(start); // add start state to queue
        start.setVisited(true);
        start.updateVisited();
        marked.put(start.getState(), true); // mark start state as visited
        visitedNodes++;

        while (!this.getQueue().isEmpty() && !goal.isVisited()) {
            AState visitedState = this.getQueue().poll(); // remove state with highest priority (i.e., smallest cost)
            ArrayList<AState> neighbors = s.getAllPossibleStates(visitedState); // get all neighboring states
            AState u = pq.remove();
            updateCameFrom(neighbors, u);
            updateCost(neighbors);
            updateDistance(neighbors);

            for (AState curr : neighbors) {
                if (!marked.containsKey(curr.getState())) { // if state has not been visited before
                    marked.put(curr.getState(), true); // mark state as visited
                    curr.setCameFrom(visitedState);
                    this.getQueue().add(curr); // add state to queue
                    curr.setVisited(true);
                    visitedNodes++;
                    curr.updateVisited();
                }

                if (curr.getState().compareTo(goal.getState()) == 0) // if goal state is found
                    return curr;
            }
        }

        // goal state was not found
        return null;
    }




    public PriorityQueue<AState> getPq() {return pq;}
    public void setPq(PriorityQueue<AState> pq) {this.pq = pq;}
    public HashMap<String, Boolean> getMarked() {return marked;}
    public void setMarked(HashMap<String, Boolean> marked) {this.marked = marked;}

    public void updateCameFrom(ArrayList<AState> array, AState s)
    {
        int i = 0;
        while (i < array.size())
        {
            AState node = array.get(i);
            node.setCameFrom(s);
            i++;
        }
    }

    public void updateCost(ArrayList<AState> array)
    {
        int i = 0;
        while (i < array.size())
        {
            AState node = array.get(i);
            if (node.getCameFrom() != null)
            {
                if (node.croos)
                    node.setCost(1.5 + node.getCameFrom().getCost());
                else
                    node.setCost(1 + node.getCameFrom().getCost());
            }
            else
            {
                if (node.croos)
                    node.setCost(1.5);
                else
                    node.setCost(1);
            }
            i++;
        }
    }

    public void updateDistance(ArrayList<AState> array)
    {
        int i = 0;
        while (i < array.size())
        {
            AState curr = array.get(i);
            if (curr.getCameFrom() == null)
                curr.distance = 0;
            else
                curr.distance = curr.getCameFrom().distance + 1;
            i++;
        }
    }

    public int getNumberOfNodesEvaluated() {return visitedNodes;}

    public String getName() {return this.name;}

    static class theComparator implements Comparator<AState>
    {
        public int compare(AState s1, AState s2)
        {
            if (s1.distance > s2.distance)
                return 1;
            if (s1.distance == s2.distance)
            {
                if (s1.getCost() > s2.getCost())
                    return 1;
                if (s1.getCost() == s2.getCost())
                    return 0;
            }
            return -1;
        }
    }

}