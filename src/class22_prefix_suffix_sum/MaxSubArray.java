package class22_prefix_suffix_sum;

public class MaxSubArray {
    public static void main(String[] args) {


    }
    private static int getMaxSubArray1(int ar[]){

        int n=ar.length;
        int prefix=0; //1,2,3,4,5
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n ;i++){
           prefix=0;

            for(int j=i;j<n;j++){
                prefix+=ar[i];

                max=prefix>max?prefix:max;

            }


        }
        return max;
    }
    private static int getMaxSubArray2(int ar[]){

        int n=ar.length;
        int currSum=0; //1,2,3,4,5
        int maxSum=ar[0];
        for(int i:ar){
            currSum+=i;
        }
        return 0;
    }
}
