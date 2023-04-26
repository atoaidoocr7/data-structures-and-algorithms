package graphs;

import java.util.*;

public class Graph {
    private List<Node> vertices;

    public List<Node> getVertices() {
        return vertices;
    }
    public void setVertices(List<Node> vertices) {
        this.vertices = vertices;
    }
    private List<Node> breadthFirstSearch(Node source){
        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        List<Node> output = new ArrayList<>();

        for(Node vertex : vertices){
            if(!visited.contains(vertex)) {
                breadthFirstSearch(vertex, output, visited, q);
            }
        }
        return output;
    }
    private List<Node> depthFirstSearch(Node source, List<Node> output, Set<Node> visited){
        return null;
    }
    private void breadthFirstSearch(Node source, List<Node> output, Set<Node> visited, Queue<Node> q){
        q.add(source);
        visited.add(source);
        while(!q.isEmpty()){
            Node current = q.poll();
            output.add(current);
            List<Node> nodes = current.getEdges();
            for(Node node : nodes){
                if(!visited.contains(node)){
                    visited.add(node);
                    q.add(node);
                }
            }
        }
    }

    private void depthFirstSearch(Node source, List<Node> output){

    }

}
