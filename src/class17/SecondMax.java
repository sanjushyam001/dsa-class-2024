package class17;

public class SecondMax {
    public static void main(String[] args) {

        secondMax(new int[]{1,2,3,8,7,6});
    }
    private static void secondMax(int ar[]){
        int secondMax=0;
        int firstMax=0;
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
            if(ar[i]>secondMax&&ar[i]<firstMax){
                secondMax=ar[i];
            }
        }
        System.out.println("FIRST MAX AND SECOND MAX : "+firstMax+" , "+secondMax);
    }
}
