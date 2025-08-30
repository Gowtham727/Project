public class Sqrtt {
    static int n=2147395599;
    public static void main(String[] args) {


           double answer=issqrt(n);
            System.out.println(answer);

    }

   public  static double issqrt(int i) {
        int low=1;int high=i;double ans=0.0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if((long) mid*mid<=i){
                 ans=mid;
                 low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
