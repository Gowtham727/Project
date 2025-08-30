public class Prime {

    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i < 5000000; i++) {

            if (prime(i)) {
                count++;
            }
       }
        System.out.println(count);
    }

       public static boolean prime(int i){
           {
               for(int j=2;j*j<=i;j++){
                   if(i%j==0 ){
                       return false;
                   }
               }
           }
           return true;
       }

}
