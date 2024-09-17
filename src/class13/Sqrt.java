package class13;

public class Sqrt {
    public static void main(String[] args) {

        System.out.println(sqrt(103));
    }
    private static int sqrt(int n){
        int i=1;
        while(i*i<=n){
            i++;
        }
        return i-1;
    }
}
