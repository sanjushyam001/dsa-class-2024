package class21_two_pointer;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int ar[]={1,1,1,1,1,1,1,1,2,2,2,2,2,2,3,3,4,4};
        int[] uniqueElements = removeDeuplicatesUsingTwoPointers(ar);
        System.out.println(Arrays.toString(uniqueElements));
    }

    private static int[] remove(int ar[]){
        int n=ar.length;
        for(int i=0;i<n-1;i++){

            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j]){
                    removeDuplicate(ar,j,n);
                    n--;
                }
            }
        }
        int newArray[]=new int[n];
        for(int i=0;i<n;i++)
            newArray[i]=ar[i];

        return newArray;
    }
    private static int[] remove1(int ar[]){
        int start=0;
        int end=start+1;
        int n=ar.length;

        while(end<n && start<=end){

            if(ar[start]==ar[end]){
                removeDuplicate(ar, end, n);
                n--;

            }else{
                start++;
                end++;
            }
        }
        int newArray[]=new int[n];
        for(int i=0;i<n;i++)
            newArray[i]=ar[i];


        return newArray;
    }
    public static int[] remove2(int[] arr) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                uniqueList.add(arr[i]);
            }
        }
        return uniqueList.stream().mapToInt(i -> i).toArray(); // Convert list to array
    }
    public static int[] remove3(int[] arr) {
        int n = arr.length;
        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }
        // Convert list back to array
        return uniqueList.stream().mapToInt(i -> i).toArray();
    }
    public static int[] removeDuplicatesUsingSet(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Convert set back to array
        return uniqueSet.stream().mapToInt(i -> i).toArray();
    }
    public static int[] removeDeuplicatesUsingTwoPointers(int ar[]){
        int n=ar.length;
        int j=0;
        for(int i=1;i<n;i++){

            if(ar[j]!=ar[i]){
                j++;
                ar[j]=ar[i];
            }
        }
        int newArray[]=new int[j+1];
        for(int i=0;i<j+1;i++)
            newArray[i]=ar[i];


        return newArray;


    }
    private static void removeDuplicate(int ar[],int j,int n){

        System.out.println("end : "+j);
        for(int i=j+1;i<n;i++)
            ar[i-1]=ar[i];
    }
}
