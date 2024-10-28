package class22_prefix_suffix_sum;

import java.util.Arrays;

public class TrappingWater {

    public static void main(String[] args) {

        int ar[]={4,2,0,5,2,6,2,3};
//        System.out.println("TOTAL TRAPPED WATER IS : "+getTotalTrappedWater1(ar));
        System.out.println("TOTAL TRAPPED WATER IS : "+getTotalTrappedWater2(ar));
    }

    private static int getTotalTrappedWater1(int ar[]) {
        int n = ar.length;
        int leftMax[] = new int[n];
        leftMax[0] = 0;
        for(int i=1;i<n;i++){
            leftMax[i]=ar[i-1]>leftMax[i-1]?ar[i-1]:leftMax[i-1];
        }
        System.out.println("LEFT MAX ARRAY IS : ");
        System.out.println(Arrays.toString(leftMax));

        int rightMax[] = new int[n];
        rightMax[n-1] = 0;
        for(int i=n-2;i>=0;i--){
            rightMax[i]=ar[i+1]>rightMax[i+1]?ar[i+1]:rightMax[i+1];
        }
        System.out.println("RIGHT MAX ARRAY IS : ");

        System.out.println(Arrays.toString(rightMax));

        int totalTrappedWater=0;
        for(int i=0;i<n;i++){

            int minHeight=leftMax[i]<rightMax[i]?leftMax[i]:rightMax[i];
            if(minHeight-ar[i]>=0)
            totalTrappedWater+=minHeight-ar[i];
        }
        return totalTrappedWater;
    }
    private static int getTotalTrappedWater2(int ar[]) {
        int n = ar.length;
        int maxBar=ar[0];
        int index=0;
        for(int i=0;i<n;i++){
            if(ar[i]>maxBar){
                maxBar=ar[i];
                index=i;
            }
        }
        int maxLeft=0;
        int totalTrappedWater=0;
        for(int i=0;i<index;i++){
            if(maxLeft>ar[i]){
                totalTrappedWater+=maxLeft-ar[i];
            }else{
                maxLeft=ar[i];
            }
        }
        int maxRight=0;

        for(int i=n-1;i>index;i--){
            if(maxRight>ar[i]){
                totalTrappedWater+=maxRight-ar[i];
            }else{
                maxRight=ar[i];
            }
        }
        return totalTrappedWater;
    }
}
