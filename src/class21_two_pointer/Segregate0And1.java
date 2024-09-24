package class21_two_pointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Segregate0And1 {

    public static void main(String[] args) {

        int ar[] = {1, 0, 0, 1, 1, 1,0,0,1};
       /* System.out.println(Arrays.toString(segregateBySelectionSort(ar)));
        System.out.println(Arrays.toString(segregateByBubbleSort(ar)));
        System.out.println(Arrays.toString(segregateByInsertionSort(ar)));
        System.out.println(Arrays.toString(segregateByPredefineLibrary(ar)));
        System.out.println(Arrays.toString(segregate1(ar)));*/
        System.out.println(Arrays.toString(segregate2(ar)));

    }

    private static int[] segregateBySelectionSort(int ar[]) {

        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[minIndex]) {
                    minIndex = j;
                }
            }
            swap(ar, i, minIndex);
        }
        return ar;
    }

    private static int[] segregateByBubbleSort(int ar[]) {
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    swap(ar, j, j + 1);
                }
            }
        }
        return ar;
    }

    private static int[] segregateByInsertionSort(int ar[]) {

        int n = ar.length;
        for (int i = 1; i < n; i++) {

            int j = i;

            while (j > 0 && ar[j - 1] > ar[j]) {
                swap(ar, j - 1, j);
            }
            i++;
        }
        return ar;
    }

    private static int[] segregateByPredefineLibrary(int ar[]) {

//        Arrays.sort(ar);
        List<Integer> list = Arrays.stream(ar)
                .boxed()
                .collect(Collectors.toList());
//        Collections.sort(list);
        /*Collections.sort(list, (i1,i2)->{
            return i1-i2;
        });*/
        /* Collections.sort(list, (i1,i2)->i1-i2);*/
        Collections.sort(list, Collections.reverseOrder());
//        Collections.sort(list, Comparator.comparing(Integer::intValue).reversed());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] segregate1(int ar[]) {
        int count1 = 0;
        int count0 = 0;
        int n = ar.length;
        for (int i = 0; i < n; i++) {
            if (ar[i] == 1)
                count1++;
            else
                count0++;
        }
        System.out.println("Count1: "+count1+" Count0: "+count0);
        for (int i = 0; i < count1;i++)
            ar[i]=1;
        for(int i=count1;i<n;i++)
            ar[i]=0;
        return ar;
    }

    private static int[] segregate2(int ar[]) {
        int start=0;
        int end = ar.length-1;
       while(start<=end) {
            if (ar[start]!=0)
                start++;
            else{
                if(ar[end]!=1){
                    end--;
                }else{
                    int tempValue=ar[start];
                    ar[start]=ar[end];
                    ar[end]=tempValue;
                    start++;
                    end--;
                }
            }



        }

        return ar;
    }

    private static void swap(int ar[], int i, int j) {

        int tempValue = ar[i];
        ar[i] = ar[j];
        ar[j] = tempValue;
    }

}
