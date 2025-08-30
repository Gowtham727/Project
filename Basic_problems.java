public class Basic_problems {
    static int digits=0;
    static int duplicate=0;
    //armstrong number
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            duplicate = i;
            digits = String.valueOf(i).length();
            if( armstrong(i, digits)) { //checks
                System.out.println("armstrong no " + i );
            }
        }
    }
    public static boolean armstrong(int number, int digits) {
        int sum = 0;
        while (number > 0) {// returns boolean
            int a = number % 10;
            sum = (int) (sum + Math.pow(a, digits));
            number /= 10;

        }
        return duplicate==sum; //either true or false
    }
}
