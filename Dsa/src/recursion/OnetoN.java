package recursion;

public class OnetoN {
    public static void main(String[] args) {
        range(10);
    }
    public static int  range(int n){
        if(n==1){
            System.out.println(n);
            return n;
        }

         range(n-1);
        System.out.println(n);
        return 0;
    }
}
