package recursion;

public class Prime2 {
    public static void main(String[] args) {
        prime(100);
    }
    public static void prime(int n) {
        if (n == 2) {

            return;
        }
        int j=2;
        if(j*j >n){
            System.out.println(n);
        }

        prime(n - 1);
        for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {
                    break;
                }
                if ((i + 1) * (i + 1) > n) {  //if in the last time it reaches out of limit
                    System.out.println(n);
                }


        }
    }
}
