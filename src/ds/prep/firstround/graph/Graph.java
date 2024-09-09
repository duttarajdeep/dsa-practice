package ds.prep.firstround.graph;

public class Graph {
    private final int V;
    int[][] adjMatrix;
    private int E;

    public Graph(int nodes) {
        this.adjMatrix = new int[nodes][nodes];
        this.V = nodes;
        this.E = 0;
    }

    public void addEdge(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges" + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adjMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
