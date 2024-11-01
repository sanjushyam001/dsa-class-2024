package class37_defanging_ip_addr_sort_sring;

public class RoteClockAndAntiClockWise {

    public static void main(String[] args) {

        String s = "abcdefg";
//        String result = getClockWiseBy1(s);
//        String result = getClockWise(s,2);
        String result = rotateStringByNTimes(s,4);
        System.out.println(result);
    }

    private static String getClockWiseBy1(String s) {

        char[] charArr = s.toCharArray();
        char ch = charArr[charArr.length - 1];
        int index = charArr.length - 2;

        while (index >= 0) {
            charArr[index + 1] = charArr[index];

            index--;
        }
        charArr[0]=ch;
        s = new String(charArr);
        return s;
    }
    private static String getClockWise(String s,int n){
        int index =s.length()-n;
        String str1=s.substring(index);
       String str2=s.substring(0,index);
       String finalString="";
        for(int i=str1.length()-1;i>=0;i--){
            finalString+=str1.charAt(i);
        }
        for(int i=0;i<str2.length();i++)
            finalString+=str2.charAt(i);




        return finalString;
    }

    private static String rotateStringByNTimes(String s ,int n){
        n=n%s.length();
//        String reversed=getReveseString();
        return s.substring(s.length()-n)+s.substring(0, s.length()-n);
    }
    private static  String getReveseString(String s){



        StringBuilder str=new StringBuilder(s);
        return str.reverse().toString();
    }
}
