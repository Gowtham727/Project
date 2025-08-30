public class Charceil {
    public static char binarysearch(int start,int end,char[] array,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return array[mid];
            }
            if(array[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        //return array[start];       ceil
        return array[end];   //floor
    }
    public static void main(String[] args) {
        char[] array={'a','b','c','e','k','l','n','z'
        };
        int start=0;
        int end=array.length-1;
        char value= binarysearch(start,end,array,'x');
        System.out.println(value);
    }
    }
