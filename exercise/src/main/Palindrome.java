public class Palindrome {
    static int duplicate=0;
    static int count=0;
    public static void main(String[] args) {


        for(int i=100;i<1000;i++){
            duplicate=i;

            if(palindromeno(i)){
                count++;
                System.out.println("palindrome no "+duplicate);

            }
        }
        System.out.println("totally "+count +"nos");

    }
    private static boolean palindromeno(int number) {
        int sum=0;
        while(number>0){
            int a=number%10;
            sum=sum*10+a;
            number/=10;
        }
        return duplicate==sum;   // return boolean
    }

}
