package graphs;
import java.util.List;
import java.util.Map;
public class DetectCycleDirected {
    //keep two visited sets
    //one for the current dfs traversal
    //and one for the overall dfs
    //once we reach a node with no neighbors,
    //remove that node from the visited set for the current dfs traversal

    //if the current neighbor is in our current dfs traversal
    //return true back to the parent caller to end further recursive calls
    public boolean checkCycle(Map<Integer, List<Integer>> graph) {
        int[] visited = new int[graph.size()];
        int[] dfsVisited = new int[graph.size()];
        for(int i = 0; i < graph.size(); i++) {
            // we do not want to revisit if we have already visited
            if(visited[i]==0) {
                if(isCycle(graph, i, visited, dfsVisited)) return true;
            }
        }
        return false;
    }
    public boolean isCycle(Map<Integer, List<Integer>> graph, int src,  int[] visited, int[] dfsVisited){
        dfsVisited[src] = 1;
        visited[src] = 1;

        for(int neighbor : graph.get(src)) {
            if(visited[neighbor]==0) {
                boolean check = isCycle(graph, neighbor, visited, dfsVisited);
                //if we ever find a cycle return back to caller
                if(check) return true;
            }else if(dfsVisited[neighbor]==1){
                return true;
            }
        }
        dfsVisited[src] = 0;
        return false;
    }
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
