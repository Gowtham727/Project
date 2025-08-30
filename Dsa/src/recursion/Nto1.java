package recursion;

public class Nto1 {
    public static void main(String[] args){
        add(5);
    }
    public static void add(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        add(n-1);
        System.out.println();


    }
}
