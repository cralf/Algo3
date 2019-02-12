/**
 * 
 */

import java.util.NoSuchElementException;

interface NoDiGraph extends Graph
{
   public Arris getArris(int u, int v) throws NoSuchElementException;
}
