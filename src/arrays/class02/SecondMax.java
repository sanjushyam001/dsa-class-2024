package arrays.class02;

public class SecondMax {
    public static void main(String[] args) {
        int ar[]={1,4,5,7,0,2};
        int secondMaxValue = secondMax(ar);
        System.out.println("Second Max Element is : "+secondMaxValue);

    }
    private static int secondMax(int ar[]){

        int firstMax=0;
        int secondMax=0;

        if(ar[0]>ar[1]){
            firstMax=ar[0];
            secondMax=ar[1];
        }else{
            firstMax=ar[1];
            secondMax=ar[0];
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]>firstMax){
                secondMax=firstMax;
                firstMax=ar[i];
            }
            else if(ar[i]<firstMax && ar[i]>secondMax ){
                secondMax=ar[i];
            }
        }
        return secondMax;
    }
}
