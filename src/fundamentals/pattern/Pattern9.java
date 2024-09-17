package fundamentals.pattern;

public class Pattern9 {
    public static void main(String[] args) {

        print(5);
    }

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                    System.out.print(j + "  ");

            }
            System.out.println();
        }
    }

}
