package class22_prefix_suffix_sum;

public class PrintAllSubArray {
    public static void main(String[] args) {
        int ar[]={4,3,7,2};
        print(ar);
    }
    private static void print(int ar[]){

        int n=ar.length;
        for(int i=0;i<n ;i++){

            for(int j=i;j<n;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(ar[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
