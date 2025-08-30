import java.util.Random;

public class Mergesort {
    public static int[] sort(int[] array,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            sort(array,left,mid);
            sort(array,mid+1,right);
            merge(array,mid,left,right);
        }
        return array;
    }
    public static int[] merge(int[] array,int mid,int left,int right){

        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftarray=new int[n1];
        int rightarray[]=new int[n2];
        for ( int i = 0; i < n1; i++) {
            leftarray[i]=array[left+i];
        }
        for (int  j= 0; j < n2; j++) {
          rightarray[j]=array[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftarray[i]<=rightarray[j]){
                 array[k++]=leftarray[i];
                 i++;
            }
            else{
                array[k++]=rightarray[j];
                j++;
            }
        }
        while(i<n1){
            array[k++]=leftarray[i];
            i++;
        }
        while(j<n2){
           array[k++]= rightarray[j];
           j++;
        }
        return array;
    }
    public static int[] generate(int size,int max){
        int array[]=new int[size];
        Random random=new Random();
        for (int i = 0; i < size; i++) {
            array[i]=random.nextInt(max);
        }
        return array;
    }
    public static void main(String[] args) {
        int size=10;
        int max=100;
       int [] arr= generate(size,max);
       for(int y:arr){
           System.out.print(y+"  ");

       }
        System.out.println();
     int[] arrays=  sort(arr,0,arr.length-1);
       for(int x:arrays){
           System.out.print(x+"  ");
       }
    }


}
