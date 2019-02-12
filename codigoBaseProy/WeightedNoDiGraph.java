/**
 * 
 */

import java.util.NoSuchElementException;

public interface WeightedNoDiGraph extends WeightedGraph, NoDiGraph
{
   public abstract WeightedArris getWeightedArris(int u, int v) throws NoSuchElementException;
}
