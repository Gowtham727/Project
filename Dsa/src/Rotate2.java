import java.util.ArrayList;

public class Rotate2 {
    public static void main(String[] args) {
        int [] nums={-1,-100,3,99};
        rotate(nums,2);
    }
    public static void rotate(int[] nums, int k) {
        ArrayList<Integer> arraylist1=new ArrayList<>();
        ArrayList<Integer> arraylist2=new ArrayList<>();
        int n=nums.length-1;
        k=k%n;
        if(k==0){
           // return nums;
        }
        for(int i=0;i<=n-k;i++){
            arraylist1.add(nums[i]);
        }
        for(int i=n-k+1;i<nums.length;i++){
            arraylist2.add(nums[i]);
        }
       arraylist2.addAll(arraylist1);
        for(int x:arraylist2){
            System.out.println(x);
        }


    }
}
