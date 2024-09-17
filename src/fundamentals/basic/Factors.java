package fundamentals.basic;

public class Factors {
    public static void main(String[] args) {

        int n=8;
        printFactorials(n);
    }
    private static void printFactorials(int n){

        int i=1;
        while(i<n){
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
