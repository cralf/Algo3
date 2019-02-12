/**
 * 
 */

import java.util.NoSuchElementException;

public interface WeightedDiGraph extends WeightedGraph, DiGraph
{
   public abstract WeightedArc getWeightedArc(int u, int v) throws NoSuchElementException;
}
