import org.w3c.dom.Node;

import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Linked linked=new Linked();
        linked.insertbegin(10);
        linked.insertbegin(20);
       linked.insertbegin(30);
       linked.insertbegin(40);
       linked.insertatmiddle(25,3);
      linked.insertatmiddle(15,5);
      linked.insertbegin(50);
      linked.insertbegin(60);
      linked.insertatend(5);
      linked.insertatend(4);
    //  linked.deleteatbegining();
      linked.deleteatmiddle(2);
      linked.display();
      linked.search(50);

    }

}
