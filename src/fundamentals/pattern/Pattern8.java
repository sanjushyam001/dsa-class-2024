package fundamentals.pattern;

public class Pattern8 {
    public static void main(String[] args) {

        print(5);
    }

    private static void print(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int c = ++count;
                if (c < 10)
                    System.out.print(c + "  ");
                else
                    System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}
