package arrays.class04BinarySearch;

public class BinarySearch01 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7};
        System.out.println(search(ar,4));
    }
    private static int search(int ar[],int target){

        int start=0;
        int end=ar.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ar[mid]==target){
                return mid;
            }else if(target>ar[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
