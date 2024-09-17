package arrays.class28TwoPointer;

import java.util.Arrays;

public class PairDiifrence {
    public static void main(String[] args) {
        int ar[]={2,3,5,10,50,80};
        int target=45;
        System.out.println("Index are : "+Arrays.toString(findDifference(ar, target)));
        int result[]=findDifference(ar, target);
        System.out.println("Values are : "+ar[result[0]]+" "+ar[result[1]]);
    }
    //Time Complexity- log(n)
    private static int[] findDifference(int ar[],int target){


        Arrays.sort(ar);
        int start=0,end=1;
        System.out.println("--"+Arrays.toString(ar));
        while(start<end){
            int value=ar[end]-ar[start];
            if(value==target){
                return new int[]{start,end};
            }else if(value<target){
                end++;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }

    //Time Complexity- Nlog(n)
    private static int[] findDifference1(int ar[],int target){

        int n=ar.length-1;
        for(int i=0;i<n;i++){

            int value=target+ar[i];
            int correctIndex=isCorrectValue(value,ar,i+1,n);
            if(correctIndex!=-1){
                return new int[]{i,correctIndex};
            }

        }
        return new int[]{-1,-1};
    }

    private static int isCorrectValue(int value,int ar[],int startIndex,int lastIndex){

        while(startIndex<lastIndex){

            int mid=lastIndex-(lastIndex-startIndex)/2;
            if(ar[mid]==value){
                return mid;
            }else if(value>ar[mid]){
                startIndex=mid+1;
            }else{
                lastIndex=mid-1;
            }
        }
        return -1;
    }
}
