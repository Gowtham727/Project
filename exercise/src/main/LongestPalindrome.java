package strings;

public class LongestPalindrome {
    public static void main(String args[]) {
        boolean ans=detectCapitalUse("Google");
        boolean ans2=detectsmallUse("Google");
        boolean ans3=detectfirstUse("Google");
        if(ans || ans2 || ans3){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
        public static  boolean detectCapitalUse(String word) {
            byte[] arr=word.getBytes();
            int capital=0;
            int n=word.length();
            if(n==0){
                return true;
            }
            for(int i=0;i<n;i++){
                if(arr[i]>=65 && arr[i]<=90){
                    capital++;
                }
            }
            return capital==n;

        }
    public static  boolean detectsmallUse(String word) {
        byte[] arr=word.getBytes();
        int capital=0;
        int n=word.length();
        if(n==0){
            return true;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>=97 && arr[i]<=122){
                capital++;
            }
        }
      return capital==n;

    }
        public static  boolean detectfirstUse(String word) {
            byte[] arr=word.getBytes();
            int capital=0;
            int n=word.length();
            if(n==0){
                return true;
            }
            if(!(arr[0]>=65 && arr[0]<=90)){  //0 already considered
                return false;
            }
            for(int i=1;i<n;i++){
                if(!(arr[i]>=97 && arr[i]<=122)){
                   return false;
                    }

                }

             return true;

        }
    }






