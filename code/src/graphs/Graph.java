package graphs;

import java.util.*;

public class Graph<E> {
    private List<Node<E>> vertices;

    public List<Node<E>> getVertices() {
        return vertices;
    }

    public void addVertices(List<Node<E>> vertices){
        System.out.println(vertices);
    }
    public void setVertices(List<Node<E>> vertices) {
        this.vertices = vertices;
    }
    private List<Node<E>> breadthFirstSearch(Node<E> source){
        Queue<Node<E>> q = new LinkedList<>();
        Set<Node<E>> visited = new HashSet<>();
        List<Node<E>> output = new ArrayList<>();

        for(Node<E> vertex : vertices){
            if(!visited.contains(vertex)) {
                breadthFirstSearch(vertex, output, visited, q);
            }
        }
        return output;
    }
    private void breadthFirstSearch(Node<E> source, List<Node<E>> output, Set<Node<E>> visited, Queue<Node<E>> q){
        q.add(source);
        visited.add(source);
        while(!q.isEmpty()){
            Node<E> current = q.poll();
            output.add(current);
            List<Node<E>> nodes = current.getEdges();
            for(Node<E> node : nodes){
                if(!visited.contains(node)){
                    visited.add(node);
                    q.add(node);
                }
            }
        }
    }

    private void depthFirstSearchRecursive(Node<E> source,  Set<Node<E>> visited){
        visited.add(source);
        List<Node<E>> neighbors = source.getEdges();
        for(Node<E> neighbor : neighbors){
            if(!visited.contains(neighbor)){
                depthFirstSearchRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String[] args){
        Graph<Integer> graph = new Graph<>();

    }

}
