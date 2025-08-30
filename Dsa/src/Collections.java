import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Collections {


    public static void main(String [] args){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
      

    }
}
