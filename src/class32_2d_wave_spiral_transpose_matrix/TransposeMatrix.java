package class32_2d_wave_spiral_transpose_matrix;

public class TransposeMatrix {

    public static void main(String[] args) {

        int ar[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        printMatrixInTransposeFormat2(ar);
    }
    private static void printMatrixInTransposeFormat(int ar[][]){

        int transposeMatrix[][]=new int[ar.length][ar[0].length];

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                transposeMatrix[i][j]=ar[j][i];
            }
        }
        print(transposeMatrix);
    }
    private static void printMatrixInTransposeFormat2(int ar[][]){
        /*for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(i<j){
                    swap(i,j,ar);
                }
            }

        }*/
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar[0].length;j++){

                    swap(i,j,ar);

            }

        }
        print(ar);
    }
    private static void swap(int i,int j,int ar[][]){
        int tempValue=ar[i][j];
        ar[i][j]=ar[j][i];
        ar[j][i]=tempValue;
    }
    private static void print(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }
}
