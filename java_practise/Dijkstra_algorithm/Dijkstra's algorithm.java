import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

public class Dijkstra {

    public static Map<Integer, Integer> dijkstra(List<List<Integer>> graph, int startNode) {
        int numNodes = graph.size();
        Map<Integer, Integer> shortestPaths = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>();

        for (int i = 0; i < numNodes; i++) {
            shortestPaths.put(i, Integer.MAX_VALUE);
        }
        shortestPaths.replace(startNode, 0);
        queue.offer(new Node(startNode, 0));

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int currentDist = currentNode.dist;
            int currentIndex = currentNode.index;

            for (int i = 0; i < numNodes; i++) {
                if (graph.get(currentIndex).get(i) != 0) {
                    int newDist = currentDist + graph.get(currentIndex).get(i);
                    if (newDist < shortestPaths.get(i)) {
                        shortestPaths.replace(i, newDist);
                        queue.offer(new Node(i, newDist));
                    }
                }
            }
        }

        return shortestPaths;
    }

    public static int getShortestPath(List<List<Integer>> graph, int startNode, int endNode) {
        Map<Integer, Integer> shortestPaths = dijkstra(graph, startNode);
        return shortestPaths.get(endNode);
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(List.of(0, 7, 9, 0, 0, 14));
        graph.add(List.of(7, 0, 10, 15, 0, 0));
        graph.add(List.of(9, 10, 0, 11, 0, 2));
        graph.add(List.of(0, 15, 11, 0, 6, 0));
        graph.add(List.of(0, 0, 0, 6, 0, 9));
        graph.add(List.of(14, 0, 2, 0, 9, 0));

        int startNode = 0;
        int endNode = 5;
        int shortestPath = getShortestPath(graph, startNode, endNode);

        System.out.println("Shortest path from node " + startNode + " to node " + endNode + ": " + shortestPath);
    }
}

class Node implements Comparable<Node> {
    int index;
    int dist;

    Node(int index, int dist) {
        this.index = index;
        this.dist = dist;
    }

    public int compareTo(Node other) {
        return Integer.compare(this.dist, other.dist);
    }
}
