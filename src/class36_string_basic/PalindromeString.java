package class36_string_basic;

public class PalindromeString {

    public static void main(String[] args) {
       if(isPalindrome2("MOM")){
           System.out.println("Yes!");
       }else{
           System.out.println("No");
       }
    }
    private static  boolean isPalindrome1(String s){

        String palindrome="";
        for(int i=s.length()-1;i>=0;i--){
            palindrome+=s.charAt(i);
        }
        return palindrome.equalsIgnoreCase(s);
    }
    private static  boolean isPalindrome2(String s){

        int begin=0;
        int end=s.length()-1;
        boolean flag=true;
        while(begin<=end){

            if(!(s.charAt(begin)==s.charAt(end))){
                flag=false;
            }
            begin++;
            end--;
        }
        return flag;
    }
    private static  boolean isPalindrome3(String s){

        String reversedString=new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(reversedString);
    }
    private static  boolean isPalindrome4(String s,int begin,int end){

        if(begin>=end)
            return true;
        if(s.charAt(begin)!=s.charAt(end))
            return false;
        return isPalindrome4(s,begin+1,end-1);
    }

}
