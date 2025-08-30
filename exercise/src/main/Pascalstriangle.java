import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Pascalstriangle {

    public static void main(String[] args) {
        int rows=3;
        ArrayList<Integer> array=new ArrayList<>();
        for (int i = 0; i<rows; i++) {
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            int number=1;
            for (int  j= 0; j <=i; j++) {
                System.out.print(number + " ");
                array.add(number);
                number = number * (i - j) / (j + 1);


            }
            System.out.printf(String.valueOf(array));
            System.out.println();

        }


    }
}
