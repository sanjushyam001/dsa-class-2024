package class40_roman_to_integer_integer_to_roman;

import java.nio.channels.Channels;

public class RomanToInteger {

    public static void main(String[] args) throws Exception {

        int result=convert("IXI");
        System.out.println("RESULT : "+result);
    }
    private static int convert(String s) throws Exception{

        char ch[]=s.toCharArray();

        int index=0;

        int sum=0;
        while(index<s.length()-1){

            if(ch[index]<ch[index+1]){
                sum-=num(ch[index]);
            }else{
                sum+=num(ch[index]);
            }
            index++;
        }
        sum+=num(ch[ch.length-1]);
        return sum;
    }
    private static  int num(char ch) throws Exception{

        if(ch=='I' || ch=='i')
            return 1;
        else if(ch=='V' || ch=='v')
            return 5;
        else if(ch=='X' || ch=='x')
            return 10;
        else if(ch=='L' || ch=='l')
            return 50;
        else if(ch=='C' || ch=='c')
            return 100;
        else if(ch=='D' || ch=='d')
            return 500;
        else if(ch=='M' || ch=='m')
            return 1000;
        else
            throw new IllegalArgumentException("Not a valid character");
    }
}
