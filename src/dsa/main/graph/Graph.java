package dsa.main.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private final LinkedList<Integer>[] adj;
    private final int V;
    private final int[] compId;
    private int ccCount;
    private int E;

    public Graph(int nodes) {
        this.adj = new LinkedList[nodes];
        this.V = nodes;
        this.E = 0;
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
        this.compId = new int[V];
        this.ccCount = 0;
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertices: " + V + ", Edges: " + E);
        sb.append("\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int e : adj[v]) {
                sb.append(e + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[this.V];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : adj[u]) {
                if (!visited[v]) {
                    q.offer(v);
                    visited[v] = true;
                }
            }
        }
    }

    // Iterative depth-first search
    public void dfs(int s) {
        boolean[] visited = new boolean[this.V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (!visited[u]) {
                visited[u] = true;
                System.out.print(u + " ");
                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    // Recursive depth-first search
    public void dfs() {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfs(v, visited);
                this.ccCount++;
            }
        }
    }

    public void dfs(int v, boolean[] visited) {
        //mark the node as visited
        visited[v] = true;

        // stamping the component ID to the node, as per the count
        compId[v] = ccCount;

        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w])
                dfs(w, visited);
        }
    }

    public int getCcCount() {
        return this.ccCount;
    }

    public boolean isConnected(int x, int y) {
        return compId[x] == compId[y];
    }
}
