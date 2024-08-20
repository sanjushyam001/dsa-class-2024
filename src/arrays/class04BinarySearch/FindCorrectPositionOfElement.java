package arrays.class04BinarySearch;

public class FindCorrectPositionOfElement {

    public static void main(String[] args) {
        int ar[]={1,4,6,8,10,14,16,18};
        System.out.println(correctPosition(ar,0));
    }
    private static int correctPosition(int ar[],int target){

        int start=0,end=ar.length-1,mid=0,correctPosition=ar.length;

        while(start<=end){
            mid=start+(end-start)/2;
            if(ar[mid]==target){
                return mid;
            }else if(ar[mid]>target){
                correctPosition=mid;
                end=end-1;
            }else{
                start=mid+1;
            }
        }
        return correctPosition;
    }
}
