package recursion;

public class SumN {
    static int no=0;
    public static void main(String[] args) {
        System.out.println(add(50));
    }
    public static int add(int n){
        if(n==0){
            return no ;
        }
        no=no+n;
        return add(n-1);
    }
}
