/**
 *
 */

import java.lang.UnsupportedOperationException;

public class Arc implements Edge
{
  private Node initial_;
  private Node final_;
  
  public Arc(Node initial, Node finall) {
      throw new UnsupportedOperationException();
  }

  public Pair<Node,Node> getExtremes() {
      throw new UnsupportedOperationException();
  }

  public Node getInitial() {
      throw new UnsupportedOperationException();
  }

  public Node getFinal() {
      throw new UnsupportedOperationException();
  }

  @Override
  public String toString() {
      throw new UnsupportedOperationException();
  }
}
