/**
 * 
 */

import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.io.IOException;
import java.util.NoSuchElementException;

public interface Graph
{
    public boolean load(String dirArchivo) throws IOException;
    
    public int getNNode();

    public int getNEdge();
    
    public boolean addNode(Node v);

    public boolean addNode(int id);

    public boolean addEdge(int u, int v);
    
    public Node getNode(int id) throws NoSuchElementException;

    public Edge getEdge(int u, int v) throws NoSuchElementException;

    public boolean isNode(int id);

    public boolean isEdge(int u, int v);

    public boolean deleteNode(int id);

    public boolean deleteEdge(int u, int v);

    public Set<Node> getNodes();

    public Set<Edge> getEdges();

    public Iterator<Node> nodeIterator();

    public Iterator<Edge> edgeIterator();

    public int degree(int id) throws NoSuchElementException;

    public List<Node> adjacents(int id) throws NoSuchElementException;
 
    public List<Edge> incidents(int id) throws NoSuchElementException;

    public void graphUnion(Graph g);

    public Object clone();

    @Override
    public String toString();
}
