package arrays.class04BinarySearch;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int ar[]={5,7,7,8,8,10};
        System.out.println("FIRST POSITION : "+first(ar, 7));
        System.out.println("LAST POSITION : "+last(ar, 7));
    }
    private static int first(int ar[],int target){

        int start=0,end=ar.length-1;
        int mid=0,firstPosition=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ar[mid]==target){
                firstPosition=mid;
                end=mid-1;
            }else if(target>ar[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return firstPosition;
    }
    private static int last(int ar[],int target){

        int start=0,end=ar.length-1;
        int mid=0,lastPosition=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ar[mid]==target){
                lastPosition=mid;
                start=start+1;
            }else if(target>ar[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return lastPosition;
    }
}
