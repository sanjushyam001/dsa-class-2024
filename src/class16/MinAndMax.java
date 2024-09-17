package class16;

public class MinAndMax {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6,7,8};
        printMAxAndMin(ar);
    }
    private static void printMAxAndMin(int ar[]){

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
            if(ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println(" MIN VALUE IS : "+min+" MAX VALUE IS : "+max);
    }
}
