package class39_add_strings_sort_vowels;

import java.util.Arrays;

public class SortVowel {

    public static void main(String[] args) {

        String result = sort2("lEetcOde");
        System.out.println("Sorted String by vowel : " + result);
    }

    private static String sort1(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                sb.append(ch);
            }
        }
//        System.out.println(sb.toString());
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);

        String sortedVowelString = new String(chars);
        System.out.println("sortedVowelString :  "+sortedVowelString);

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                if (index < sortedVowelString.length())
                    result.append(sortedVowelString.charAt(index++));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private static String sort2(String s){

        int lowerCase[]=new int[26];
        int upperCase[]=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                int index=ch-'a';
                lowerCase[index]++;
            }
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                int index=ch-'A';
                upperCase[index]++;
            }

        }
        StringBuilder sort=new StringBuilder();
        for(int i=0;i<26;i++){


            while(upperCase[i]>0){
                char c=(char)('A'+i);
                sort.append(c);
                upperCase[i]--;

            }
        }
        for(int i=0;i<26;i++){


            while(lowerCase[i]>0){
                char c=(char)('a'+i);
                sort.append(c);
                lowerCase[i]--;

            }
        }

        System.out.println("sort : "+sort.toString());

        StringBuilder result = new StringBuilder();
        int index=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                if (index < sort.length())
                    result.append(sort.charAt(index++));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
