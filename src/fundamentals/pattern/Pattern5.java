package fundamentals.pattern;

public class Pattern5 {
    public static void main(String[] args) {

        print(5);
    }
    private static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j*j+" ");
            }
            System.out.println();
        }
    }

}
