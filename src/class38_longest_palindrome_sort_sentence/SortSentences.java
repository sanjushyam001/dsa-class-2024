package class38_longest_palindrome_sort_sentence;

import java.util.Arrays;

public class SortSentences {
    public static void main(String[] args) {
        String s="this1 hello0 is2 my3 friend4";
        sort(s);
    }
    private static void sort(String s){

        String ar[]=new String[10];
        int count=0;

        int index=0;
        String temp="";
        while(index<s.length()){

            if(s.charAt(index)!=' '){
                temp+=s.charAt(index);
            }else{
                int p=temp.charAt(temp.length()-1)-'0';
                ar[p]=temp.substring(0,temp.length()-1);
                temp="";
                count++;
            }
            index++;
        }
        int p=temp.charAt(temp.length()-1)-'0';
        ar[p]=temp.substring(0,temp.length()-1);
        temp="";
        count++;

        System.out.println(Arrays.toString(ar));
    }
}
