public class Fibonacci {
    static int value = 0;
    public static void main(String[] args) {
        int start=0;
        int end=1;
        for(int i=0;i<100;i++){
            System.out.print(start +" " );
             value=start+end;
            start=end;
            end=value;
        }
    }
}