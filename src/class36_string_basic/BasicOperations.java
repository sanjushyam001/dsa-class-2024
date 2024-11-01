package class36_string_basic;

public class BasicOperations {
    public static void main(String[] args) {

//        print();
//        calculateLength1();
        calculateLength2();
    }
    private static void print(){
        String s="Hello friend\'s this my \" BABY \"";
        System.out.println(s);
    }
    private static void calculateLength1(){
        String s="sanjeev kumar";
        int length=0;

        try{
            while(true){
                s.charAt(length);
                length++;

            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Length of string is : "+length);
        }
    }
    private static void calculateLength2(){
        String s="sanjeev kumar";
        int length=0;

        for(char c:s.toCharArray()){

            length++;
        }
        System.out.println("Length of given string is : "+length);
    }
}
