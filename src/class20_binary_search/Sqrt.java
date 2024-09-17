package class20_binary_search;

public class Sqrt {
    public static void main(String[] args) {

        /*int result=find(80);
        System.out.println("Result : "+result);*/
        int result=find1(100);
        System.out.println("Result : "+result);

    }
    /*Brute force */
    private static int find(int target){


        for(int i=1;i<=target;i++){
            if(i*i==target)
               return i;
            else if (i*i>target){
                return i-1;
            }
        }
        return -1;

    }
    /* binary search*/
    private static int find1(int target){

        int start=1;
        int n=target;
        int end=n;
        int mid=0;
        int result=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid==target/mid){
                return mid;
            }else if(mid<target/mid){
                result=mid;
                start=mid+1;
            }else {
                end=mid-1;
            }

        }


        return result;

    }
}
