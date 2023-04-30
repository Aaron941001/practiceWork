import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Kruskal {
    static int V = 7;

    static int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    static void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    static void kruskal(int[][] graph) {
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        Queue<Edge> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (graph[i][j] != 0) {
                    queue.offer(new Edge(i, j, graph[i][j]));
                }
            }
        }

        queue.sort((a, b) -> a.weight - b.weight);

        int count = 0, i = 0;
        while (count < V - 1) {
            Edge edge = queue.poll();
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);

            if (x != y) {
                System.out.println(edge.src + " - " + edge.dest);
                count++;
                union(parent, x, y);
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = new int[][] { { 0, 7, 9, 0, 0, 14 }, { 7, 0, 9, 10, 15, 0 }, { 9, 10, 0, 11, 0, 2 }, { 0, 15, 11, 0, 6, 0 }, { 0, 0, 0, 6, 0, 9 },
                { 14, 0, 2, 0, 9, 0 } };
        kruskal(graph);
    }
}

class Edge {
    int src, dest, weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}