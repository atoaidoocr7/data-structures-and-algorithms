package graphs;
import java.util.*;
public class DetectCycleUndirected {
    public boolean checkCycle(Map<Integer, List<Integer>> graph) {
        //check if theres a node starting at each cycle
        //we make sure not to repeat visitatin of nodes
        boolean[] visited = new boolean[graph.size()];
        for(int i = 0; i < graph.size(); i++) {
            if(!visited[i]) {
                if(checkCycle(graph, i, -1, visited)==true) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkCycle(Map<Integer, List<Integer>> graph, int src, int parent, boolean[] visited) {
        visited[src]= true;
        for(int neighbor : graph.get(src)) {
            if(visited[neighbor]==false) {
                boolean check = checkCycle(graph, neighbor, src, visited);
                if(check) return true;
            }
            else if(visited[neighbor]==true) {
                //if this neighbor has been already seen and is not the parent of
                //the current node then we are in a cycle. This essentially means
                //we are back at a node we already visited hence we have a cycle.
                //return true to caller and stop further recursive calls
                if(neighbor != parent) return true;
            }
        }
        return false;
    }

}
