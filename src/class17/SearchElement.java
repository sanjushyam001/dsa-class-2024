package class17;

public class SearchElement {

    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};
        int target=4;
        int i = find(ar, target);
        System.out.println("Index: "+i);

    }
    private static int find(int ar[],int target){

        for(int i=0;i<ar.length;i++){
            if(target==ar[i]){
                return i;
            }
        }
        return -1;
    }
}
