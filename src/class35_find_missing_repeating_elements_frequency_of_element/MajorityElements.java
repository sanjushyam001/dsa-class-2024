package class35_find_missing_repeating_elements_frequency_of_element;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElements {
    public static void main(String[] args) {

        int ar[] = {3, 3, 2, 3, 1, 3, 2, 2, 1, 3, 3};
        printMajorityElements3(ar);

    }

    private static void printMajorityElements1(int ar[]) {

        Arrays.sort(ar);
        int prev = 0;
        int count = 0;
        /*{1,1,2,2,3,3,3,3,3,3,3}*/
        for (int i = 0; i < ar.length; i++) {

            if (ar[i] == prev) {
                count++;//1
            } else {
                prev = ar[i];// prev=2
                if (i != 0)
                    System.out.println("Element: " + ar[i - 1] + " Frequency: " + (count + 1));
                count = 0;
            }
            if (i == ar.length - 1) {
                System.out.println("Element: " + ar[i] + " Frequency: " + (count + 1));
            }
            if ((count + 1) > ((ar.length) / 2)) {
                System.out.println(" Majority " + ar[i] + " count : " + (count + 1));
            }


        }


        System.out.println(Arrays.toString(ar));
    }

    private static void printMajorityElements2(int ar[]) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
       /* Arrays.stream(ar)
                .forEach(n->{
                    if(!frequencyMap.containsKey(n)){
                        frequencyMap.put(n, 1);
                    }else{
                        frequencyMap.put(n, frequencyMap.get(n)+1);
                    }
                });
        frequencyMap.forEach((key,value)->{
//            System.out.println(" element is : "+key+" frequency is : "+value);

        });*/


        Arrays.stream(ar)
                .forEach(n -> frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1)
                );
        AtomicBoolean flag= new AtomicBoolean(false);
        AtomicInteger majorityElement= new AtomicInteger(-1);
        frequencyMap.forEach(
                (k, v) -> {
                    if(v>(ar.length/2)){
                        flag.set(true);
                        majorityElement.set(k);
                    }


                }
        );
        if(flag.get()){
            System.out.println("Yes Present : "+majorityElement.get());
        }else{
            System.out.println("Not Present  ");
        }
    }

    /*Moore voting algorithms*/
    private static void printMajorityElements3(int ar[]){

        int count=0;
        int candidate=0;

        for(int i=0;i<ar.length;i++){

            if(count==0){
                count=1;
                candidate=ar[i];
            }else{

                if(candidate==ar[i]){
                    count++;
                }else{
                    count--;
                }
            }
        }

        for(int i=0;i<ar.length;i++){

            if(candidate==ar[i]){
                count++;
            }
        }
        if(count>(ar.length/2)){
            System.out.println("Yes "+candidate+" is a Majority element");
        }else{
            System.out.println("No "+candidate+" is not a Majority element");
        }
    }
}
