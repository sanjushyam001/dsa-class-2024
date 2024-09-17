package fundamentals.pattern;

public class Pattern1 {

    public static void main(String[] args) {

//        print(5);
        print2(5);
    }
    private static void print(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void print2(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
