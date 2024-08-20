package arrays.class01Basic;

public class FindMinAndMax {
    public static void main(String[] args) {
        int ar[]={1,4,5,7,0,8,2};

        int min = min(ar);
        int max = max(ar);
        System.out.println("MAX ELEMENT : "+max+" MIN ELEMENT : "+min);

    }
    private static int min(int ar[]){
        int minValue=Integer.MAX_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]<minValue){
                minValue=ar[i];
            }
        }
        return minValue;
    }
    private static int max(int ar[]){
        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]>maxValue){
                maxValue=ar[i];
            }
        }
        return maxValue;
    }
}
