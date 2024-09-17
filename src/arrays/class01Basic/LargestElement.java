package arrays.class01Basic;

public class LargestElement {

    public static void main(String[] args) {
        int ar[]={1,2,3,5,8,7};
        System.out.println(largestNumber(ar));

    }
    private static int largestNumber(int ar[]){

        int largest=Integer.MIN_VALUE;

        int i=0;
        while(i<ar.length){

            if(ar[i]>largest)
                largest=ar[i];
            i++;
        }
        return largest;
    }
}
