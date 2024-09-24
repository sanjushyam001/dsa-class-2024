package class21_two_pointer;

public class PairWithGivenDefference {
    public static void main(String[] args) {

        int ar[]={2,3,5,10,50,80};
        int target=45;
        int result[]=find1(ar, target);
        System.out.println("Indices are: "+result[0]+" , "+result[1]);
    }

    private static int[] find(int ar[],int target){
        int n=ar.length;
        for(int i=0;i<n;i++){

            int start=i+1;
            int end=n-1;
            while(start<=end){

                int mid=start+(end-start)/2;
                int diff=(ar[mid]-ar[i]);
                if(diff==target)
                    return new int[]{i,mid};
                if(diff<target){
                    start=mid+1;
                }else if(diff>target){
                    end=mid-1;
                }
            }
        }
        return new int[]{-1,-1};
    }
    private static int[] find1(int ar[],int target){
       int start=0;
       int end=start+1;

            while(start<=end){

                int diff=ar[end]-ar[start];
                if(diff==target)
                    return new int[]{end,start};
                else if(diff<target)
                    end++;
                else
                    start++;



        }
        return new int[]{-1,-1};
    }
}

