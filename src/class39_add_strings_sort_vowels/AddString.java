package class39_add_strings_sort_vowels;

public class AddString {

    public static void main(String[] args) {

        String s1="1234";
        String s2="55";
        System.out.println("After adding two strings: "+add(s1, s2));

    }
    private static String add(String s1,String s2){

        int index1=s1.length()-1;
        int index2=s2.length()-1;
        int sum=0;
        int carry=0;
        String result="";
        while(index2>=0){
            sum+=(s1.charAt(index1)-'0')+(s2.charAt(index2)-'0')+carry;
            carry=sum/10;
            char ch=(char)('0'+(sum%10));
            //result+=ch;
            result=ch+result;
            sum=0;
            index1--;
            index2--;

        }
        while(index1>=0){
            sum+=(s1.charAt(index1)-'0')+carry;
            carry=sum/10;
            char ch=(char)('0'+(sum%10));
            //result+=ch;
            result=ch+result;
            sum=0;
            index1--;
        }
        return result;
    }
}
