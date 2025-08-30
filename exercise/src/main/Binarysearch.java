package Examproblems;

import java.util.Random;

public class Binarysearch {
    public static int binarysearch(int array[],int target){
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int[] sort(int [] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && key<array[j]){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
        return array;
    }

    public static int[] generate(int size,int max){
        Random random=new Random();
        int[] array=new int [size];
        for (int i = 0; i < size; i++) {
            array[i]= random.nextInt(max);

        }
        return array;
    }
    public static void main(String[] args) {
        int size=10;
        int max=100;
        int[] arr=generate(size,max);
        for(int x:arr){
            System.out.print(x+" ");
        }
     int [] arra=sort(arr);
        System.out.println();
        for (int y:arra){
            System.out.print(y+" ");
        }
        int target=10;
        int value=  binarysearch(arr,target);
        if(value==-1){
            System.out.println("no found");
        }
        else {
            System.out.println("found");
        }
    }
}
