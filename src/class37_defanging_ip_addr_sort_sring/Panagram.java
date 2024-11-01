package class37_defanging_ip_addr_sort_sring;

public class Panagram {

    public static void main(String[] args) {

        String s="abcdefghijklmnopqrstuvwxyz";
        if(isPanagram(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    private static boolean isPanagram(String s){

        int check[]=new int[26];

        //97 -- 122
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';

            check[index]=1;

        }
        for(int i=0;i<check.length;i++){

            if(check[i]==0)
                return false;
        }
        return true;

    }
}
