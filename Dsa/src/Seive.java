public class Seive {
    public static void main(String[] args) {
        int n=100;
        boolean[] array=new boolean[n+1]; //default value is false
        seive(array,n);
    }
    public  static void seive(boolean[] array, int n) {
          for(int i=2;i*i<=n;i++){
              if(!array[i]){     // false->prime no
                  for(int j=i*2;j<=n;j+=i){
                      array[j]=true;  //if true - > not a prime
                  }
              }
          }
          for(int i=2;i<=n;i++){
              if(!array[i]){
                  System.out.print(i+ " ");
              }
          }
    }
}


// public static void main(String[] args){
//        int[] arr={0,1,0,3,12};
//        moveZeroes(arr);
//    }
//}
//    public static void moveZeroes(int[] nums) {
//        int index=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0){
//                int temp=nums[i];
//                nums[index]=temp;
//                nums[i]=nums[index];
//                index++;
//            }
//        }
//        for(int x:nums){
//            System.out.println(x);}
//
//
//    }
//    }