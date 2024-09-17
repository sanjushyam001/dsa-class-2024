package class20_binary_search;

public class FindCorrectPosition {
    public static void main(String[] args) {

        int ar[]={1,4,6,8,10,14,16,18};
        /*int index=find(ar,20);
        System.out.println("Index is : "+index);*/
        int index=find1(ar,20);
        System.out.println("Index is : "+index );

    }
    /* Brute force solution */
    private static int find(int ar[],int target){

        for(int i=0;i<ar.length;i++){

            if(target>ar[ar.length-1])
                return ar.length;
            if(ar[i]==target)
                return i;
            if(ar[i]>target)
                return i;

        }
        return -1;
    }
    /* Binary search */
    private static int find1(int ar[],int target){

        int start=0;
        int n=ar.length;
        int end=n-1;
        int mid=0;
        int result=n;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ar[mid]==target)
                return mid;
            else if(ar[mid]<target){
                start=mid+1;
            }else{
                result=mid;
                /* here mid can be potential answer*/
                end=mid-1;

            }
        }
        return result;
    }
}
