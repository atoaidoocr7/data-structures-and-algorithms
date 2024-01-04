package graphs;
import java.util.*;

import java.util.Comparator;

public class Dijkstra {


    public static class Node{
        public int val, distance;
        public Node(int node, int distance){
            this.val = node;
            this.distance = distance;
        }
    }

    private static class NodeComparator implements Comparator<Node>{
        public int compare(Node a, Node  b){
            return Integer.compare(a.distance, b.distance);
        }
    }

 
    public static Map<Integer, Integer> shortestPath(Map<Integer, List<Node>> graph, int src){
        NodeComparator nodeComparator = new NodeComparator();

        Queue<Node> pq = new PriorityQueue<>(nodeComparator);
        Map<Integer, Integer> distances = new HashMap<>();
        Map<Integer, Integer> fromMap = new HashMap<>();

        for(int node : graph.keySet()){
            distances.put(node, Integer.MAX_VALUE);
            fromMap.put(node, Integer.MAX_VALUE);
        }

        distances.put(src, 0);
        fromMap.put(src, src);
        pq.add(new Node(src, 0));

        while(!pq.isEmpty()){
            Node currentNode = pq.poll();
            System.out.printf("Current node is: %s%n", currentNode);
        }


        return null;
    }
    public static void main(String[] args) {
        Map<Integer, Integer> result  = Dijkstra.shortestPath(null, 0);
        System.out.println(result);
    }
}
