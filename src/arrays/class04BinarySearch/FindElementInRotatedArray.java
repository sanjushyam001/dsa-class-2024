package arrays.class04BinarySearch;

public class FindElementInRotatedArray {
    public static void main(String[] args) {
        int ar[] = {4, 6, 8, 10, 1, 2};
        int target=8;
//        int ar[] = {1,2,3,4,5,6,7};
        System.out.println(ar[findElement(ar,target)]);
    }

    private static int findElement(int ar[],int target) {

        int start = 0, end = ar.length - 1, mid = -1, minElement = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if(ar[mid]==target)
                return mid;
            else if (ar[mid]>=ar[0]) {
               if(target>=ar[0]&& target<=ar[mid-1]){
                   end=mid-1;
               }else{
                   start=mid+1;
               }
            } else {
                if(target>=ar[mid+1]&& target<=ar[ar.length-1]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return minElement;
    }
}
