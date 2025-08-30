package strings;

public class Reverseonlyletters {
    public static void main(String[] args) {
       char[] value= reverseOnlyLetters("a--cd");
        System.out.println(value);
    }
    public static char[] reverseOnlyLetters(String s) {
        //two pointers
       char[] arr=s.toCharArray();  //mutable update
        int start=0;
        int end=s.length()-1;
        while(start < end){
            if(!Character.isLetter(arr[start])){
                start++;
            }
            else if(!Character.isLetter(arr[end])){
                end--;

            }
            else{
                char temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
                end--;
                start++;
            }

        }
        return arr;



    }
}