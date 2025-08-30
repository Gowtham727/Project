package Examproblems;

import java.util.Arrays;

public class Prim {
    static int V=5;
    public static int minvalue(int[] key,boolean[] visited){
        int min=Integer.MAX_VALUE;
        int minindex=-1;
        for (int v = 0; v < V; v++) {
            if(!visited[v] && key[v]<=min){
                min=key[v];
                minindex=v;
            }

        }
        return minindex;
    }
    public static void prims(int[] [] graph){
        int[] parent=new int[V];
        int[] key=new int[V];
        boolean[] visited=new boolean[V];
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        parent[0]=-1;
        for (int count = 0; count < V-1; count++) {
            int u = minvalue(key, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && graph[u][v]<key[v]){
                    parent[v]=u;
                    key[v]=graph[u][v];
                }

            }
        }
        print(parent,graph);
    }
    public static void print(int[] parent,int[][] graph){
        for (int i = 1; i < V; i++) {
            System.out.println(parent[i ]+" - "+i +"  \t \t "+graph[i][parent[i]]);

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };
       prims(graph);
    }
}
