/**
 *
 */

import java.lang.UnsupportedOperationException;

public class WeightedArc extends Arc implements WeightedEdge
{
  private double weight_;
  
  public WeightedArc(Node initial, Node finall, double weight) {
      super(initial, finall);
      throw new UnsupportedOperationException();
  }

  public double getWeight(){
      throw new UnsupportedOperationException();
  }

  public void setWeight(double p){
      throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
      throw new UnsupportedOperationException();
  }
}
