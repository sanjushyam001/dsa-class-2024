package arrays.class28TwoPointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int ar[]={2,7,11,15,27};
        int target=22;
        System.out.println("Index are : "+Arrays.toString(findTwoSum(ar, target)));
        int result[]=findTwoSum(ar, target);
        System.out.println("Values are : "+ar[result[0]]+" "+ar[result[1]]);
    }
    private static int[] findTwoSum(int ar[],int target){

        int start=0,end=ar.length-1;

        while(start<end){
            int sum=ar[start]+ar[end];
            if(sum==target){
                return new int[]{start,end};
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
