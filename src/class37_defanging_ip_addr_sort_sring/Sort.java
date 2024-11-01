package class37_defanging_ip_addr_sort_sring;

public class Sort {

    public static void main(String[] args) {
        String s="ebcdef";
        String sortedString = sort(s);
        System.out.println("Sorted String is : "+sortedString);



    }
    private static String sort(String s){

        int count[]=new int[26];
        //O(n)
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            count[index]++;
        }
       /* String s1 = "";
        for(int i=0;i<count.length;i++){

            char c=(char)('a'+i);

            while(count[i]>0){
                s1+=c;
                count[i]--;
            }
        }
        return s1;

        */
        char sortedChars[]=new char[s.length()];
        int index=0;
        //O(1) because we are size of array 26 is constant
        for(int i=0;i<26;i++){
            while(count[i]>0) {
                sortedChars[index++] = (char) ('a' +i);
                count[i]--;
            }
        }
        return new String(sortedChars);
    }
}
