package class20_binary_search;

public class FIndMinInRotatedArray {
    public static void main(String[] args) {

        int ar[]={4,6,8,10,1,2};
        if(find(ar)!=-1){
            System.out.println("Min Index: "+find(ar)+" Element is : "+ar[find(ar)]);
        }else{
            System.out.println("Min Element is not found!");
        }
    }
    private static int find(int ar[]){

        int n=ar.length;
        int start=0;
        int end=n-1;
        int mid=0;
        int minIndex=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(ar[mid]>ar[0]){
                start=mid+1;
            }else{
                minIndex=mid;
                end=mid-1;
            }
        }

        return minIndex;
    }
}
