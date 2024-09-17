package fundamentals.basic;

public class PrimeNumber {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
       /* boolean isPrime = isPrime(13);
        if(isPrime){
            System.out.println("Prime!");
        }else{
            System.out.println("Not Prime!");
        }*/

        printPrimeNumbers(ar);



    }
    private static void printPrimeNumbers(int ar[]){
        for(int i=0;i<ar.length;i++){
            if(ar[i]>1&&isPrime(ar[i])){
                System.out.println(ar[i]);
            }
        }
    }
    private static boolean isPrime(int number){

        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;

    }
}
