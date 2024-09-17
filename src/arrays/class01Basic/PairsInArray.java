package arrays.class01Basic;

import java.util.ArrayList;
import java.util.List;

public class PairsInArray {
    public static void main(String[] args) {

        int ar[]={2,4,6,8,10};
        for(int[] array:pairs(ar)){
            System.out.print("[ ");
            for(int i:array){

                System.out.print(i+",");
            }
            System.out.print(" ]");
            System.out.println();

        }
    }
    private static List<int[]> pairs(int ar[]){
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            int currValue=ar[i];
            for(int j=i+1;j<ar.length;j++){
                list.add(new int[]{currValue,ar[j]});
            }
        }
        return list;
    }
}
