package Examproblems;

    import java.util.*;

    public class Dijkstra {

        static final int V = 9; // Number of vertices
        // Find the vertex with the minimum distance value from the set of vertices not yet processed
        int minDistance(int[] dist, boolean[] visited) {
            int min = Integer.MAX_VALUE, minIndex = -1;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && dist[v] <= min) {
                    min = dist[v];
                    minIndex = v;
                }
            }
            return minIndex;
        }

        // Print the final shortest distances
        void printSolution(int[] dist) {
            System.out.println("Vertex \t\t Distance from Source");
            for (int i = 0; i < V; i++)
                System.out.println(i + " \t\t " + dist[i]);
        }

        // Main Dijkstra function
        void dijkstra(int[][] graph, int src) {
            int[] dist = new int[V];         // Output array. dist[i] will hold the shortest distance from src to i
            boolean[] visited = new boolean[V]; // visited[i] is true if vertex i is processed

            // Initialize all distances as INFINITE and visited[] as false
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[src] = 0;

            // Find shortest path for all vertices
            for (int count = 0; count < V - 1; count++) {
                int u = minDistance(dist, visited);
                visited[u] = true;

                // Update dist[v] if it's not visited, and u-v is connected, and total weight is smaller
                for (int v = 0; v < V; v++) {
                    if (!visited[v] &&
                            graph[u][v] != 0 &&
                            dist[u] != Integer.MAX_VALUE &&
                            dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }

            printSolution(dist);
        }


        // Example usage
        public static void main(String[] args) {
            int[][] graph = {
                    {0, 4, 0, 0, 0, 0, 0, 8, 0},
                    {4, 0, 8, 0, 0, 0, 0, 11, 0},
                    {0, 8, 0, 7, 0, 4, 0, 0, 2},
                    {0, 0, 7, 0, 9, 14, 0, 0, 0},
                    {0, 0, 0, 9, 0, 10, 0, 0, 0},
                    {0, 0, 4, 14, 10, 0, 2, 0, 0},
                    {0, 0, 0, 0, 0, 2, 0, 1, 6},
                    {8, 11, 0, 0, 0, 0, 1, 0, 7},
                    {0, 0, 2, 0, 0, 0, 6, 7, 0}
            };

            Dijkstra d = new Dijkstra();
            d.dijkstra(graph, 0);  // Source vertex = 0
        }
    }


