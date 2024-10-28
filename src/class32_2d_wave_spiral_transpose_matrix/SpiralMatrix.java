package class32_2d_wave_spiral_transpose_matrix;

public class SpiralMatrix {
    public static void main(String[] args) {
        int ar[][] = {
                {1},
                {2},
                {3},
                {4},
                {5}
//                {1,2,3,4,5}
                /*{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15,},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30}*/
        };
        printMatrixInSprialFormat(ar);
    }

    private static void printMatrixInSprialFormat(int ar[][]) {

        int top = 0;
        int right = ar[0].length - 1;
        int bottom = ar.length - 1;
        int left = 0;

        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++) {
                System.out.print(ar[top][j] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(ar[i][right] + " ");

            }
            right--;
            if(top<=bottom){
                for (int j = right; j >= left; j--) {
                    System.out.print(ar[bottom][j] + " ");

                }
            }
            bottom--;
            if(left<=right){
                for (int i = bottom; i >= top; i--) {
                    System.out.print(ar[i][left] + " ");

                }
            }

            left++;
        }
    }
}
