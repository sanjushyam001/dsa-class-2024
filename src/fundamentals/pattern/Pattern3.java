package fundamentals.pattern;

public class Pattern3 {
    public static void main(String[] args) {

        print(5);
    }
    private static void print(int n){

        for(int i=0;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
