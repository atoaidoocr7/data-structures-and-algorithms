package graphs;

import java.util.ArrayList;
import java.util.List;

public class Node<E>{
    private E value;
    private List<Node> edges;

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

    public List<Node> getEdges() {
        return edges;
    }

    public void setEdges(List<Node> edges) {
        this.edges = edges;
    }

    public void generateEdges(List<Node> nodes){
        nodes.forEach(edges::add);
    }

    public String toString(){
        return String.valueOf(value);
    }


}
