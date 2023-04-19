package algorithms.search;

public abstract class AState {
    private String state;
    private double cost;
    private AState cameFrom;
    public boolean visit;
    public double distance;
    public boolean croos;
    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return this.state;
    }



    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public double getCost()
    {
        return this.cost;
    }

    public void setCameFrom(AState cameFrom)
    {
        this.cameFrom = cameFrom;
    }
    public abstract void setVisited(boolean visited);
    public AState getCameFrom()
    {
        return this.cameFrom;
    }
    public boolean isVisited(){
        return this.visit;
    }
    public abstract void updateVisited();
}


