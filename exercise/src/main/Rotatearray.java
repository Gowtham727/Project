public class Rotatearray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int n=array.length;
        int rotate=3;
        while(rotate!=0) {         //rotate array by k
            int last = array[n - 1];
            for (int i = n - 1; i >0; i--) {
                array[i] = array[i - 1];

            }
            array[0] = last;
            rotate--;
        }

        for (int x:array){
            System.out.print(x +" ");
        }
    }
}
