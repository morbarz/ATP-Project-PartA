package algorithms.search;

public abstract class AState {
    public String state;
    public double cost;
    public AState cameFrom;
    public boolean visit;
    public double distance;
    public boolean diagonal;

}


