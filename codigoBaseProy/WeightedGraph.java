/**
 * 
 */

import java.util.NoSuchElementException;

public interface WeightedGraph extends Graph
{
   public abstract WeightedNode getWeightedNode(int id) throws NoSuchElementException;

   public abstract WeightedEdge getWeightedEdge(int u, int v) throws NoSuchElementException;
}
