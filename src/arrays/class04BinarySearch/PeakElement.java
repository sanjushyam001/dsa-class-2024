package arrays.class04BinarySearch;

public class PeakElement {
    public static void main(String[] args) {

        int ar[]={1,6,3,2,1};
        System.out.println(peakElement(ar));
    }

    private static int peakElement(int ar[]) {
        int start = 0, end = ar.length - 1, mid = -1;
        for (int i = 0; i < ar.length; i++) {
            mid = end + (start - end) / 2;
            if (ar[mid] > ar[mid - 1] && ar[mid] > ar[mid + 1]) {
                return mid;
            } else if (ar[mid] > ar[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return mid;
    }
}
