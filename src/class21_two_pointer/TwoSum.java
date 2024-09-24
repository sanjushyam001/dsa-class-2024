package class21_two_pointer;

public class TwoSum {
    public static void main(String[] args) {

        int ar[]={2,7,11,15,27};
        int target=22;
        int result[]=find1(ar, target);
        System.out.println("Indices are: "+result[0]+" , "+result[1]);
    }

    private static int[] find(int ar[], int target) {

        int n = ar.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {

            int sum = ar[start] + ar[end];
            if (sum == target) return new int[]{start, end};
            else if (sum < target) start++;
            else end--;
        }

        return new int[]{-1,-1};
    }

    private static int[] find1(int ar[],int target){
        int n=ar.length;
        for(int i=0;i<n;i++){

            int start=i+1;
            int end=n-1;
            while(start<=end){

                int mid=start+(end-start)/2;
                int sum=(ar[i]+ar[mid]);
                if(sum==target)
                    return new int[]{i,mid};
                if(sum<target){
                    start=mid+1;
                }else if(sum>target){
                    end=mid-1;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
