package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node<E>{
    private E value;
    private List<Node<E>> edges;

    public Node(E value){
        this.value = value;
        this.edges = new ArrayList<>();
    }

    public E getValue() {
        return value;
    }
    public void setValue(E value) {
        this.value = value;
    }

    public List<Node<E>> getEdges() {
        return edges;
    }

    public void setEdges(List<Node<E>> edges) {
        this.edges = edges;
    }

    public void generateEdgesNodes(List<Node<E>> nodes){
        edges.addAll(nodes);
    }
    public void generateEdgesValues(List<E> nodes){
        for(E item : nodes){
            edges.add(new Node(item));
        }
    }

    public String toString(){
        return String.valueOf(value);
    }

}
