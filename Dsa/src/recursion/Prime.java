package recursion;

public class Prime {
    static int level=9;
    public static void main(String[] args) {
       prime(level);
    }
    public static void prime(int n){
        if(n==2){
            return;
        }
        prime( n-1);
        for(int i=2;i*i<=n;i++){
            if(n%i==0 ){
                break;
            }
            if((i+1)*(i+1)>n){
                System.out.println(n);
            }

        }

    }
}
