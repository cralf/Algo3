/**
 * 
 */

import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public abstract class NodeLabeledGraph extends AbstractGraph
{
   protected String[] nodeNames_;

   public abstract int getNodeId(String l) throws NoSuchElementException;


   public String getNodeLabel(int id) throws NoSuchElementException {
      throw new UnsupportedOperationException();
   }

}
