package class20_binary_search;

public class PeakElement {
    public static void main(String[] args) {
//        int ar[] = {2, 4, 6, 8, 10, 8, 5};
        int ar[] = {1,6,4,2,3};
        int peakElementIndex = find(ar);
        if (peakElementIndex != -1)
            System.out.println("PEAK ELEMENT INDEX : " + peakElementIndex + " ELEMENT " + ar[peakElementIndex]);
        else
            System.out.println("NO PEAK ELEMENT FOUND!");
    }

    private static int find(int ar[]) {

        int n = ar.length;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        while (start <= end) {
//            mid = start + (end - start) / 2;
            mid = end + (start - end) / 2;

            if (ar[mid] > ar[mid - 1] && ar[mid] > ar[mid + 1]) {
                return mid;
            } else if (ar[mid] > ar[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
