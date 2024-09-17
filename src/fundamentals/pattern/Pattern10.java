package fundamentals.pattern;

public class Pattern10 {
    public static void main(String[] args) {

        print(5);
    }

    private static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print((char)('a'+(i-1)));

            }
            System.out.println();
        }
    }

}
