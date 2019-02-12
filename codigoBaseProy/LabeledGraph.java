/**
 * 
 */

import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public abstract class LabeledGraph extends AbstractGraph
{
   protected String[] nodeNames_;
   protected String[] edgeNames_;

   public abstract int getNodeId(String l) throws NoSuchElementException;

   public abstract int getEdgeId(String l) throws NoSuchElementException;

   public abstract boolean deleteEdge(String l);

   public abstract boolean addEdge(String l);

   public String getNodeLabel(int id) throws NoSuchElementException {
      throw new UnsupportedOperationException();
   }

   public String getEdgeLabel(int id) throws NoSuchElementException {
      throw new UnsupportedOperationException();
   }
}
