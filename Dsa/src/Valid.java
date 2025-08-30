import java.util.ArrayList;

public class Valid {
    public static void main(String[] args){
String s="()";
System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {

        int low=0;
        int high=0;
        ArrayList<Character> arraylist=new ArrayList<>();
       // arraylist.add(s.charAt(0));
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '*'){
                low--;
                high++;
            }
            else if(s.charAt(i) == ')'){
                low--;
                high--;
            }
            else{
                low++;
                high++;
            }
            if (high < 0) return false; // too many ')'
            if (low < 0) low = 0;
        }
        return low == 0;     // open count can't be negative
    }



    }



