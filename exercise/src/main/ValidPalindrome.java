package strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String name="deeee";
        char[] arr=name.toCharArray();
        boolean ans=chararray(arr,name);
        System.out.println(ans);}
       public static boolean chararray(char[] arr,String name){
             int start=0;
        int k=0;
        int end=name.length()-1;
        while(start<end){
            if(arr[start] != arr[end])
            {
               if(k<1){
                   end--;
                   k++;
               }
               else{
                   return false;
               }
            }
            else{
                start++;
                end--;
            }

        }
        return true;
    }
}
//"deeee"
