package class13;

public class AddDigits {
    public static void main(String[] args) {

        int n=12345;
        int result = add(n);
        System.out.println("SUM OF DIGITS IS : "+result);


    }
    private static int add(int n){

        int sum=0;
        int rem=0;

//        while(true)
        while(n>9){
            sum=0;

            while(n!=0){

                rem=n%10;
                sum+=rem;
                n/=10;
            }
            n=sum;
            /*if(sum>9){
                n=sum;
                sum=0;
            }else{
                break;
            }
*/
        }
        return sum;
    }
}
