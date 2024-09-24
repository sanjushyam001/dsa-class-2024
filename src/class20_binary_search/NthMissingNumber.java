package class20_binary_search;

public class NthMissingNumber {
    public static void main(String[] args) {
        int ar[]={2,3,4,7,11,12};
        int k=5;
//        find(ar,k);
        int kthMissingNumber=find1(ar,k);
        System.out.println(k+"th Missng Number is : "+kthMissingNumber);
    }
    // Brute Force Approach TC=O(n^2)
    private static void find(int ar[],int m){
        int n=ar.length;
        int k=ar[n-1];
        int count=0;
        System.out.println("Missing numbers are: ");
        for(int i=1;i<=k;i++){
            int flag=0;
            for(int j=0;j<n;j++){
                if(ar[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag!=1) {
                count++;
//                System.out.print(i + " ");
                if(count==m){
                    System.out.println("count "+count);
                    System.out.println(m+"th missing number is : "+i);
                }
            }

        }
    }

    private static int find1(int ar[],int k){

        int n=ar.length;
        int start=0;
        int end=n-1;
        int mid=0;
        int ans=0;
        while(start<=end){

            mid=start+(end-start)/2;
            if(ar[mid]-mid-1>=k){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
//        int result=ar[ans]-((ar[ans]-ans-1)-k+1);
        //when we will open above equation
        int result=ans+k;
        return result;
    }
}
