public class Reshpae566 {
    public static void main(String[] args) {
    int[][] mat = {{1, 2}, {3, 4}};
     int[][] finals=  matrixReshape(mat,1,4);
    for(int i=0;i<finals.length;i++){
        for(int j=0;j<finals[0].length;j++){
            System.out.print(finals[i][j] +" ");
        }
        System.out.println();

    }}
        public static int[][] matrixReshape(int[][] mat, int r, int c) {
            int[][] matrix=new int[r][c];
            int rows=0,cols=0;
            int rowlen=mat.length;
            int collen=mat[0].length;

            if(rowlen*collen !=r*c){
                return mat;
            }


            else{
                for(int i=0;i<rowlen;i++){
                    for(int j=0;j<collen;j++){
                        matrix[rows][cols]=mat[i][j];
                        cols++;
                        if(cols==c){
                            cols=0;
                            rows++;
                        }

                    }
                }
            }
            return matrix;
        }
        }


