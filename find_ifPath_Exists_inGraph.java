//Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create an adjacency list
        ArrayList<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // Fill the adjacency list
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]); // Since it's an undirected graph
        }

        // BFS to find the path
        return bfs(graph, source, destination);
    }

    private boolean bfs(ArrayList<Integer>[] graph, int source, int destination) {
        if (source == destination) {
            return true; // Early return if source is destination
        }

        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // Explore neighbors
            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    if (neighbor == destination) {
                        return true; // Found the path
                    }
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        
        return false; // No path found
    }
}
