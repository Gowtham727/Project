public class Prime {
    public static void main(String[] args){
        int n=20;
        for(int i=1;i<=n;i++){
            System.out.println(i +" " +isprime(i));
        }
    }

   public  static boolean isprime(int i) {
        if(i<=1){
            return false;
        }
        int c=2;
        while(c*c<=i){  //checking the limit
            if(i%c==0){  //check for the n/2,3,4,5,6,7,8,
                return false;
            }
            c++;
        }
        return true;
    }
}
