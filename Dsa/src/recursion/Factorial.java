package recursion;

public class Factorial {
    static  int no=1;
    public static void main(String[] args) {
        System.out.println( factorial(5));
    }
    public static int factorial(int n){
        if(n==1){
           return n;}
        int ans=0;
       ans= n*factorial(n-1);
        System.out.println(ans);
       return ans;


    }
}
