public class Sqrt2 {
    public static void main(String[] args) {
        int n=2000;
        int ans=0;
        for(int i=1;i*i<=n;i++){
           ans=i;
        }
        System.out.println(ans);
    }
}
