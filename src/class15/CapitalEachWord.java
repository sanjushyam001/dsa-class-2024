package class15;

public class CapitalEachWord {
    public static void main(String[] args) {

        convert(new char[]{'a','b'});
    }
    private static void convert(char ch[]){

        int i=0;
        while(i<ch.length){
            System.out.print((char)(ch[i]-32));
            i++;
        }

    }
}
