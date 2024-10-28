package class34_binary_search_2d_array;

public class BinarySearch2D {
    public static void main(String[] args) {

        int ar[][] = {
                {2, 6, 10, 14, 18},
                {20, 24, 27, 29, 38},
                {47, 52, 78, 93, 102},
                {108, 111, 200, 218, 320}
        };

        int result[] = search3(ar, 27);
        System.out.println("Position is " + result[0] + " " + result[1]);
    }

    /* TC=o(n^2) */
    private static int[] search1(int ar[][], int target) {

        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};

    }

    /* TC=(n+logM) here M is no of columns */
    private static int[] search2(int ar[][], int target) {

        int n = ar.length;

        for (int i = 0; i < n; i++) {

            int start = 0;
            int end = ar[i].length - 1;
            while (start <= end) {

                int mid = (start + end) / 2;
                if (ar[i][mid] == target)
                    return new int[]{i, mid};
                else if (target < ar[i][mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return new int[]{-1, -1};

    }

    /* TC=nlogN but each row and column should be sorted in ascending order */
    private static int[] search3(int ar[][], int target) {

        int start = 0;
        /*
        n=row's length-1
        m=col's length-1
        ar[n][m]=> index=n*(no of column)+m=>3*5+4=20
        * */
        int l = ar[0].length;
        int end = (ar.length - 1) * l + l - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int rowIndex = mid / l;
            int colIndex = mid % l;
            if (ar[rowIndex][colIndex] == target)
                return new int[]{rowIndex, colIndex};
            else if (ar[rowIndex][colIndex] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return new int[]{-1, -1};

    }

    /* matrix row and col sorted, but it's not sorted as row major
    *
    * worst TC O(n+m) n=> no of rows and m no of cols
    * Best TC O(1) if we find element at first attempt means element is present at
    * ar[0][m-1]
    * */
    private static int[] search4() {

        int ar[][] = {
                {4, 8, 15, 25, 60},
                {18, 22, 26, 42, 80},
                {36, 40, 45, 68, 104},
                {48, 50, 72, 83, 120}
        };
        int target = 26;

        int rowIndex = 0;
        int colIndex = ar[0].length - 1;

        while (colIndex >= 0 && rowIndex <= ar.length - 1) {

            if (ar[rowIndex][colIndex] == target) {
                return new int[]{rowIndex, colIndex};
            } else if (target < ar[rowIndex][colIndex]) {
                colIndex--;
            } else {
                rowIndex++;
            }
        }


        return new int[]{-1, -1};

    }
}
