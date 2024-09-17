package class20_binary_search;

public class FindFirstAndLastElement {
    public static void main(String[] args) {

        int ar[]={5,7,7,8,8,10};
        int target=8;
       /* int index=findFirst(ar,target);
        System.out.println("first element index is : "+index);*/
        int index=findLast(ar, target);
        System.out.println("last element index is : "+index);
    }
    private static int findFirst(int ar[],int target){

        int n=ar.length;
        int start=0;
        int end=n-1;
        int mid=0;
        int firstElement=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ar[mid]==target){
                firstElement=mid;
                end=mid-1;
            }else if(target>ar[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return firstElement;
    }
    private static int findLast(int ar[],int target){

        int n=ar.length;
        int start=0;
        int end=n-1;
        int mid=0;
        int lastElement=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ar[mid]==target){
                lastElement=mid;
                start=mid+1;
            }else if(target>ar[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return lastElement;
    }
}
