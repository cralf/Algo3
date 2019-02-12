/**
 * 
 */

import java.lang.UnsupportedOperationException;

public class WeightedNode extends Node
{
  protected double weight_;
  
  public WeightedNode(int id, double weight) {
    super(id);
    throw new UnsupportedOperationException();
  }

  public double getWeight() {
      throw new UnsupportedOperationException();
  }

  public void setWeight(double p) {
      throw new UnsupportedOperationException();
  }

  @Override
  public String toString() { 
      throw new UnsupportedOperationException();
  }
}
