package recursion;

public class CountZero {
    static int count=0;
    public static void main(String[] args){
        int n=10;
       String str= Integer.toString(n);
       int ans= find(str,0,str.length()-1,0);

        System.out.println(ans);
    }

    static int counting(String str,int start,int end,int count){
      return   find(str,start,end,count);
    }


    public static int  find(String str,int start,int end,int count){
        if(start>end){
            return count;
        }
        if(str.charAt(start)=='0' && str.charAt(end)=='0' ){
            count+=2;
        }
         if(str.charAt(start)=='0' ||str.charAt(end)=='0'){
             count++;

        }
      return   find(str,start+1,end-1,count);
    }

}
//if 100101 no use % opertor and split and count
