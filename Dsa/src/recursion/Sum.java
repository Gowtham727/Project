package recursion;

public class Sum {
    public static void main(String[] args) {
        System.out.println( sum(5));
    }
    public static int sum(int n){
        if(n==1){
            return n;
        }
        int no=0;
      no=   n+sum(n-1);
        System.out.println(no);
        return no;
    }
}
