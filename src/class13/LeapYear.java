package class13;

public class LeapYear {
    public static void main(String[] args) {

        boolean result = isLeapYear(2004);
        System.out.println("Is Leap Year ? "+result);

    }
    private static boolean isLeapYear(int y){

        if(y%400==0 ||(y%4==0)&&(y%100!=0)){
            return true;
        }
        return false;
    }
}
