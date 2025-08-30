import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Factor {
    public static void main(String[] args) {
        int n=100;
        int no=0;
       ArrayList<Integer> arrayList=new ArrayList<>();
        ArrayList<Integer> arrayList1=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){

                 no=n/i;//returns the quotient
                 if(no!=i){
                arrayList1.add(no);  //quotinet which is in desc
                arrayList.add(i);}//dividend
                else{
                    arrayList.add(i);
                 }

            }
        }
        for(int i:arrayList){
            System.out.println(i);
        }
        for(int i=arrayList1.toArray().length-1;i>=0;i--) {
            System.out.println(arrayList1.get(i));
        }




    }
}
