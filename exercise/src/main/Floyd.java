package Examproblems;

public class Floyd {
    static int INF=9999;
    public static void floyds(int [][] grpah){
        int v= grpah.length;
        int[][] dist=new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                dist[i][j]=grpah[i][j];
            }
        }
        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if(dist[i][k]+dist[k][j]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
                }
            }
        print(dist);
        }
        public static void print(int[][] dist){
        int v= dist.length;
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                     if(dist[i][j]==INF){
                         System.out.print("INF ");
                     }
                     else{
                         System.out.print(dist[i][j]+" ");
                     }
                }
                System.out.println();

            }
        }
    public static void main(String[] args) {
        int[][] graph={
                {0, 5, INF, 10},
                {INF, 0, 3, INF},
                {INF, INF, 0, 1},
                {INF, INF, INF, 0}
        };
        floyds(graph);
    }
}
