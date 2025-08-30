public class Naivepattern {
    public static void find(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }

            }
            if(j==m){
                System.out.println("found at "+i);
            }

        }
    }
    public static void main(String[] args) {
        String text="abcdefghijk";
        String pattern="jk";
        find(text,pattern);
    }
}
