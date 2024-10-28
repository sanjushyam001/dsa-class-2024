package class35_find_missing_repeating_elements_frequency_of_element;

import java.net.DatagramPacket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountFrequency {

    public static void main(String[] args) {

        int ar[] = {1, 2, 2, 4, 3, 7, 6};
//        getFrequency1(ar);
        getFrequency2(ar);
    }

    private static void getFrequency1(int ar[]) {

        int n = Arrays.stream(ar).max().getAsInt();
        int newArr[] = new int[n];
        for (int i = 0; i < n; i++) {

            newArr[ar[i] - 1]++;

        }
        for (int i = 0; i < newArr.length; i++) {

            System.out.println("Element is : " + (i + 1) + " and frequency is : " + newArr[i]);
        }
    }

    private static void getFrequency2(int ar[]) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        /*for (Integer i : ar) {

            if (!frequencyMap.containsKey(i))
                frequencyMap.put(i, 1);
            else
                frequencyMap.put(i, frequencyMap.get(i) + 1);


        }
        Set<Map.Entry<Integer, Integer>> entries = frequencyMap.entrySet();

        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println("Element : " + entry.getKey() + " Frequency: " + entry.getValue());

        }*/

        /*Arrays.stream(ar).forEach((i)-> {
            if (!frequencyMap.containsKey(i))
                frequencyMap.put(i, 1);
            else
                frequencyMap.put(i, frequencyMap.get(i) + 1);
        });
        frequencyMap.forEach((k,v)-> System.out.println(k+" : "+v));*/

        Arrays.stream(ar)
                .forEach(n->frequencyMap.put(n,
                        frequencyMap.getOrDefault(n,0)+1)
                );
        frequencyMap.forEach((key,value)->System.out.println(key+" : "+value));


    }
}
