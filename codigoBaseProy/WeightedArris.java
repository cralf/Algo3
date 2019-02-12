/**
 *
 */

import java.lang.UnsupportedOperationException;

public class WeightedArris extends Arris implements WeightedEdge
{
  private double weight_;
  
  public WeightedArris(double weight, Node initial, Node finall) {
      super(initial, finall);
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
