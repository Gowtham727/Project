package Examproblems;

public class Reverse {
    public static void main(String[] args) {
        String s="madam";
         boolean ans=
                 reverseString(s);
        System.out.println(ans);
    }
    public static boolean reverseString(String s) {//use two pointer approach
            int i=0;
             s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
            String S=s.toLowerCase();
        int n=S.length();

            for (i = 0; i < n; i++) {
                if (S.charAt(i) != S.charAt(n - 1 - i)) {
                    return false;
                }

            }

            return true;


        }
    }
//"A man, a plan, a canal: Panama"



