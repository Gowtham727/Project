package recursion;

public class Stringrev {
    public static void main(String[] args) {
        System.out.println( rev("abcdefghijk"));
    }
    public static String rev(String alpha){
        if (alpha.isEmpty()) {
            return alpha;
        }
        return rev(alpha.substring(1)) + alpha.charAt(0);
    }
}
