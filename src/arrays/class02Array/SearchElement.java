package arrays.class02Array;

public class SearchElement {
    public static void main(String[] args) {
        int ar[]={1,4,5,7,0,8,2};
        int searchedElementIndex = search(ar, 0);
        System.out.println("RESULT : "+searchedElementIndex);

    }
    private static int search(int ar[],int target){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==target){
                return i;
            }
        }
        return -1;
    }
}
