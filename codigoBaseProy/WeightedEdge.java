/**
 * 
 */

public interface WeightedEdge extends Edge
{

  public double getWeight();

  public void setWeight(double p);

  @Override
  public String toString();

}
