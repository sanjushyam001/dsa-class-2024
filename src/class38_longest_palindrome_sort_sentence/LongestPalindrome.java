package class38_longest_palindrome_sort_sentence;

import java.util.Arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
      String s="abdddffAAggggggccbaa";
      //abdfgggbabgggfdba
        int longestPalidrome = findLongestPalidrome(s);
        System.out.println("longestPalidrome is : "+longestPalidrome);

    }
    private static int findLongestPalidrome(String s){

        int lowerCount[]=new int[26];
        int upperCount[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'){
                int index=s.charAt(i)-'a';
                lowerCount[index]++;
            }else{
                int index=s.charAt(i)-'A';
                upperCount[index]++;
            }



        }
        System.out.println(Arrays.toString(lowerCount));
        System.out.println(Arrays.toString(upperCount));
        int result=0;
        int flag=0;
        for(int i=0;i<26;i++){

            if(lowerCount[i]%2==0){
                result+=lowerCount[i];
            }else{
                result+=lowerCount[i]-1;
                flag = 1;
            }
            if(upperCount[i]%2==0){
                result+=upperCount[i];
            }else{
                result+=upperCount[i]-1;
                flag = 1;
            }
        }
        return result+flag;
    }
}
