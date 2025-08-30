package recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
       String name= "malayalam";
        System.out.println( palindrome("malayalam",0,name.length()-1 ));
    }
    public static boolean palindrome(String name,int start,int end){
        if(start>=end){
            return true;
        }
        if(name.charAt(start) != name .charAt(end)){
            return false;
        }
      return  palindrome(name,start+1,end-1);

    }
}

