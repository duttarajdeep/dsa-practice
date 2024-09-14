package ds.prep.firstround.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(3, 4);

        // BFS
        // graph.bfs(0);
        // System.out.println();

        // DFS - Iterative
        // graph.dfs(0);
        // System.out.println();

        // DFS - Recursive
        graph.dfs();
        System.out.println();

        System.out.println("No of: connected components: " + graph.getCcCount());
        System.out.println("Is connected: (2,3): " + graph.isConnected(2, 3));
    }
}
