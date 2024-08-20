package arrays.class04BinarySearch;

public class MinElementInRotatedArray {
    public static void main(String[] args) {
//        int ar[] = {4, 6, 8, 10, 1, 2};
        int ar[] = {1,2,3,4,5,6,7};
        System.out.println(ar[findMinElement(ar)]);
    }

    private static int findMinElement(int ar[]) {

        int start = 0, end = ar.length - 1, mid = -1, minElement = 0;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (ar[mid] >=ar[0]) {
                start = mid + 1;
            } else {
                minElement = mid;
                end = mid - 1;
            }
        }
        return minElement;
    }
}
