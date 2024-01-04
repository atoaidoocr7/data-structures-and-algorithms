package graphs;

public class DisjointSet {
    private final int[] parent = new int[10000];
    private final int[] rank = new int[10000];

    public DisjointSet() {
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }
    public int findParent(int a){
        if(parent[a] == a) return a;

        return this.parent[a] = findParent(this.parent[a]);
    }
    public void union(int a, int b){
        a = findParent(a);
        b = findParent(b);

        if(this.rank[a] < this.rank[b]){
            this.parent[a] = b;
            this.rank[b]++;
        }else if(this.rank[b] < this.rank[a]){
            this.parent[b] = a;
            this.rank[a]++;
        }else{
            this.parent[b] = a;
            this.rank[a]++;
        }
    }

    public static void main(String[] args){}
}
