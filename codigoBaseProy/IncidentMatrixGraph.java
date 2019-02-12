import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;


public class IncidentMatrixGraph extends LabeledGraph implements DiGraph {

	public boolean load(String dirArchivo) throws IOException{
      throw new UnsupportedOperationException();
   }
    
    public int getNNode(){
      throw new UnsupportedOperationException();
   }

    public int getNEdge(){
      throw new UnsupportedOperationException();
   }
    
    public boolean addNode(Node v){
      throw new UnsupportedOperationException();
   }

    public boolean addNode(int id){
      throw new UnsupportedOperationException();
   }

    public boolean addEdge(int u, int v){
      throw new UnsupportedOperationException();
   }
    
    public Node getNode(int id) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

    public Edge getEdge(int u, int v) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

    public boolean isNode(int id){
      throw new UnsupportedOperationException();
   }

    public boolean isEdge(int u, int v){
      throw new UnsupportedOperationException();
   }

    public boolean deleteNode(int id){
      throw new UnsupportedOperationException();
   }

    public boolean deleteEdge(int u, int v){
      throw new UnsupportedOperationException();
   }

    public Set<Node> getNodes(){
      throw new UnsupportedOperationException();
   }

    public Set<Edge> getEdges(){
      throw new UnsupportedOperationException();
   }

    public Iterator<Node> nodeIterator(){
      throw new UnsupportedOperationException();
   }

    public Iterator<Edge> edgeIterator(){
      throw new UnsupportedOperationException();
   }

    public int degree(int id) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

    public List<Node> adjacents(int id) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }
 
    public List<Edge> incidents(int id) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

    public void graphUnion(Graph g){
      throw new UnsupportedOperationException();
   }

    public Object clone(){
      throw new UnsupportedOperationException();
   }

    @Override
    public String toString(){
      throw new UnsupportedOperationException();
   }

    public  int getNodeId(String l) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

   	public  int getEdgeId(String l) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

   	public  boolean deleteEdge(String l){
      throw new UnsupportedOperationException();
   }

   	public  boolean addEdge(String l){
      throw new UnsupportedOperationException();
   }

   	public String getNodeLabel(int id) throws NoSuchElementException {
      throw new UnsupportedOperationException();
   }

   	public String getEdgeLabel(int id) throws NoSuchElementException {
      throw new UnsupportedOperationException();
   }

    public Arc getArc(int initial, int finall) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

    public int internalDegree(int id) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

    public int externalDegree(int id) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }

    public List<Node> predecessors(int id) throws NoSuchElementException{
      throw new UnsupportedOperationException();
   }
}