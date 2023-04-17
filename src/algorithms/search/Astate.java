package algorithms.search;

public abstract class Astate {
    public String state;
    public double cost;
    public Astate cameFrom;
    public boolean visit;
    public double distance;
    public boolean croos;
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public void setCameFrom(Astate cameFrom)
    {
        this.cameFrom = cameFrom;
    }
    public abstract boolean isVisited();
    public abstract void setVisited(boolean visited);
    public void setState(String state)
    {this.state = state;}
}


