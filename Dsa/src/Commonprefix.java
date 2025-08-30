import java.util.ArrayList;
import java.util.List;

public class Commonprefix {
    public  static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8}};
             List<Integer> ans=  spiralOrder(matrix);
        System.out.println(ans);
        StringBuilder str=new StringBuilder();
        str=null;
    }

        public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list=new ArrayList<>();
            ArrayList<Integer> arraylist=new ArrayList<>();
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(i>0 && i< matrix.length-1 && j==matrix[0].length-1){
                        list.add(matrix[i][j]);
                    }
                    if(i==matrix.length-1 ){
                        int value=matrix[i][matrix[0].length-1-j];
                        list.add(value);
                    }
                    if(i>0 && i<matrix.length-1){
                        if(j!=matrix[0].length-1){
                        arraylist.add(matrix[i][j]);}
                    }
                    else{
                        if(i!=matrix.length-1) {
                            list.add(matrix[i][j]);
                        }                    }

                }}
                for(int x:arraylist){
                    list.add(x);

            }
            return list;
        }
    }

