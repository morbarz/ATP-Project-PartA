package algorithms.search;

public abstract class AState {
    public String state;
    public double cost;
    public AState cameFrom;
    public boolean visit;
    public double distance;
    public boolean croos;
    public void setState(String state)
    {
        this.state = state;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setCameFrom(AState cameFrom)
    {
        this.cameFrom = cameFrom;
    }
    public abstract void setVisited(boolean visited);

}


