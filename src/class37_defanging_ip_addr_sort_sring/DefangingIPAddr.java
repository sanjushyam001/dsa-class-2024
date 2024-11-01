package class37_defanging_ip_addr_sort_sring;

public class DefangingIPAddr {

    public static void main(String[] args) {

        String ipAddr="127.0.0.1";
        String defangingIPAddr = getDefangingIPAddr3(ipAddr);
        System.out.println(defangingIPAddr);

    }
    private static String getDefangingIPAddr1(String s){

        String modifyString="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                modifyString+="[.]";
            }else{
                modifyString+=s.charAt(i);
            }
        }
        return modifyString;
    }
    private static String getDefangingIPAddr2(String s){

        StringBuilder modifyString=new StringBuilder(s);
        for(int i=0;i<modifyString.length();i++){
            if(modifyString.charAt(i)=='.'){
                modifyString.replace(i,i+1,"[.]");
            }
        }
        return modifyString.toString();
    }
    private static String getDefangingIPAddr3(String s){

        StringBuilder modifyString=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='.'){
                modifyString.append("[.]");
            }else {
                modifyString.append(c);
            }
        }
        return modifyString.toString();
    }
}
