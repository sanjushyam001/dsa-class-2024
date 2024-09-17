package class12;

public class DecimalToOcta {
    public static void main(String[] args) {

        System.out.println(convert(13));
    }
    private static int convert(int n){

        int i=0;
        int ans=0;
        while(n!=0){
            int rem=n%8;
            ans=rem*(int)Math.pow(10, i)+ans;
            n/=8;
            i++;


        }
        return ans;
    }
}
