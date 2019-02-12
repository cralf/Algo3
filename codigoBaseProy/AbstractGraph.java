/**
 * 
 */

import java.lang.UnsupportedOperationException;

public abstract class AbstractGraph implements Graph
{
    protected int nNode_;
    protected int nEdge_;

    public AbstractGraph(){
      ;    // no completar, esta linea ya esta bien asi
    }

    public AbstractGraph(int nNode, int nEdge) {
      throw new UnsupportedOperationException();
    }

    public int getNNode() {
      throw new UnsupportedOperationException();
    }

    public int getNEdge() {
      throw new UnsupportedOperationException();
    }

    public abstract String toString();

    public abstract Object clone();
}
