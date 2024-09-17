package class13;

public class Complement {
    public static void main(String[] args) {

        System.out.println(get(27));
    }
    private static int get(int n){
        int sum=0;
        int i=0;
        int mul=1;
        while(n!=0){
            int rem=n%2;
            if(rem==0)
                rem=1;
            else
                rem=0;
//            sum+=rem*(int)  Math.pow(2, i);
            sum+=rem*mul;
            mul*=2;

            n/=2;
            i++;
        }
        return sum;
    }
}
