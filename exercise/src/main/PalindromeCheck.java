package strings;

public class PalindromeCheck
{
    public static void main(String[] args) {
        String name="09MaDaM  90 @#!@";

        String ans=name.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.println(ans);
        int n=ans.length();


        for(int i=0;i<n/2;i++){
            if(ans.charAt(i) == ans.charAt(n-1-i)){
                System.out.println(true);
            }
        }


    }
}
