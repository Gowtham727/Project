package strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
      //converting from uppercase to lowercase without using any built in
        String name="GOWTHAMabc";
        StringBuilder str=new StringBuilder();
        byte[] ans=name.getBytes();
        System.out.println(Arrays.toString(ans));
        char res= 0;
        for (int i = 0; i < ans.length; i++) {
            if(ans[i] <97 ){
               res= (char) ((char) ans[i]+32);
                str.append(res);

            }
            else{
              res=  (char)ans[i];
              str.append(res);

            }


        }
        String val=str.toString();
        System.out.println(val);


    }
}
