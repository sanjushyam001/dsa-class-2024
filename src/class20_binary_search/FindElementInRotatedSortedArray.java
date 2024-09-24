package class20_binary_search;

public class FindElementInRotatedSortedArray {
    public static void main(String[] args) {


        int ar[] = {4, 6, 8, 10, 1, 2};
        int index = find(ar, 4);
        if (index != -1)
            System.out.println("index is : " + index);
        else
            System.out.println("Element is not found!");
    }

    private static int find(int ar[], int target) {

        int n = ar.length;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        /*while (start <= end) {
            mid = start + (end - start) / 2;

            if (ar[mid] == target) {
                return mid;
            } else if (ar[mid] >= ar[0]) {
                if (target >= ar[start] && target <= ar[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= ar[mid] && target <= ar[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }*/

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (ar[mid] == target) {
                return mid;
            } else if (ar[mid] >= ar[0]) {
                if (target >= ar[start] && target <= ar[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= ar[mid] && target <= ar[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
