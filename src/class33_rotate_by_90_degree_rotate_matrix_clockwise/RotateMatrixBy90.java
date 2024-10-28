package class33_rotate_by_90_degree_rotate_matrix_clockwise;

public class RotateMatrixBy90 {
    public static void main(String[] args) {


        int ar[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("Before \n");

        print(ar);
        System.out.println("after \n");

//        int rotatedAr[][]=rotateWithExtraSpace(ar);
//        print(rotatedAr);
        int rotatedAr[][]=rotateWithNoExtraSpace(ar);
        print(rotatedAr);
    }
    private static int[][] rotateWithExtraSpace(int ar[][]){
        int n=ar.length;

        int newAr[][]=new int[n][n];
        for(int i=0;i<n ;i++){

            for(int j=0;j<n;j++){
                newAr[j][n-1-i]=ar[i][j];
            }
        }
return newAr;
    }
    private static int[][] rotateWithNoExtraSpace(int ar[][]){
        int n=ar.length;
        /*
        * Transpose the ar
        * */
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(i, j, ar);
            }
        }
        /*
        rotate each row of the matrix
         */

        int rotateRowMatrix[][]=rotateEachRow(ar);
        return rotateRowMatrix;
    }
    private static void swap(int i,int j,int ar[][]){
        int tempValue=ar[i][j];
        ar[i][j]=ar[j][i];
        ar[j][i]=tempValue;
    }
    private static int[][] rotateEachRow(int ar[][]){



        int n=ar.length;
        System.out.println("N :: "+n);
        for(int row=0;row<n ;row++){
            int start=0;
            int end=n-1;
            while(start<=end){
                int temp=ar[row][start];
                ar[row][start]=ar[row][end];
                ar[row][end]=temp;
                start++;
                end--;
            }
        }
        return ar;
    }
    private static void print(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
