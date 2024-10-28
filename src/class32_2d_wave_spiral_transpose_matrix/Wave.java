package class32_2d_wave_spiral_transpose_matrix;

public class Wave {
    public static void main(String[] args) {

        int ar[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };
        printInWaveFormat(ar);
    }

    /*
    * Time complexity (row*col)*/
    private static void printInWaveFormat(int ar[][]) {



        for(int col=0;col<ar[0].length;col++){

            if(col%2==0){
                for(int row=0;row<ar.length;row++) {
                    System.out.print(ar[row][col]+" ");
                }
            }else{
                for(int row=ar.length-1;row>=0;row--) {
                    System.out.print(ar[row][col]+" ");
                }
            }




        }
    }
}
