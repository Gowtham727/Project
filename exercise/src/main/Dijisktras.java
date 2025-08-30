package Examproblems;

import java.util.Arrays;

public class Dijisktras {
    static int V=9;
    public  static int  minvertex(int [] dist,boolean[] visited){
        int min=Integer.MAX_VALUE;
        int minindex=-1;
        for (int v = 0; v < V; v++) {
            if(!visited[v] && dist[v]<=min ){
                min=dist[v];
                minindex=v;
            }

        }
        return minindex;
    }
    public static int[] dijisktras(int [] [] graph,int src){
        int[] dist=new int[V];
        boolean[] visited=new boolean[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        for (int count = 0; count < V-1; count++) {
           int u= minvertex(dist,visited);
           visited[u]=true;
            for (int v = 0; v < V; v++) {
                if(!visited[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u] +graph[u][v] <dist[v]){
                    dist[v]=dist[u]+graph[u][v];
                }

            }

        }
        print(dist);
        return dist;


    }
    public static void print(int [] dist){
        System.out.println("the sortedd path");
        for (int i = 0; i < V; i++) {
            System.out.println(i +" \t\t " +dist[i]);

        }
        System.out.println();
    }
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
        int target=8;
       int[] dist= dijisktras(graph,0);
        System.out.println("the dist is "+dist[target]);


    }
}
