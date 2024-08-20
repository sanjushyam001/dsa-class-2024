package arrays.class04BinarySearch;

public class FindSqrt {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8,9,10};
        int target=75;
        System.out.println(findSqrt(ar,target));
    }
    private static int findSqrt(int ar[],int target){

        if(target<2) return target;
        int start=0,end=ar.length-1;
        int mid=0,index=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if((ar[mid])==(target/ar[mid])){

                return mid;
            }else if((target/ar[mid])>(ar[mid])){
                index=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return index;
    }
}
