/**
 * 
 */

import java.util.List;
import java.util.NoSuchElementException;

interface DiGraph extends Graph
{
    public Arc getArc(int initial, int finall) throws NoSuchElementException;

    public int internalDegree(int id) throws NoSuchElementException;

    public int externalDegree(int id) throws NoSuchElementException;

    public List<Node> predecessors(int id) throws NoSuchElementException;
}
