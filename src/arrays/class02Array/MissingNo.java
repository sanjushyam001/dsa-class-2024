package arrays.class02Array;

public class MissingNo {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,7};
        int missingNo = missingNo(ar);
        System.out.println("Missing no : "+missingNo);


    }
    private static int missingNo(int ar[]){
        int totalSum=0;
        int n=ar.length+1;
        for(int i:ar){
            totalSum+=i;
        }
        int sumOfNnumbers=((n*(n+1))/2);
//        System.out.println(sumOfNnumbers);
        return sumOfNnumbers-totalSum;
    }
}
