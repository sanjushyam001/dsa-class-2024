package class35_find_missing_repeating_elements_frequency_of_element;

import java.util.Arrays;

public class FindMissingAndRepeatingElements {
    public static void main(String[] args) {

        /*Repeating elements 2 and Missing element 5*/
        int ar[] = {1, 2, 2, 4, 3, 7, 6};

//        find1(ar);
        find2(ar);


    }

    /*Brute force TC o(n^2)*/
    private static int[] find1(int ar[]) {
        int n = Arrays.stream(ar).max().getAsInt();
        for (int i = 1; i <= n; i++) {

            int count = 0;
            for (int j = 0; j < ar.length; j++) {

                if (ar[j] == i) {
                    count++;
                }
                if (count > 1) {
                    System.out.println("repeating : " + i);
                    break;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 0; j < ar.length; j++) {
                if (i == ar[j]) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("missing : " + i);
                break;
            }
        }

        return new int[]{-1, -1};
    }

    /*
    we follow this approach if we have given limited range,this is not suitable for
    big range because here we are taking extra space so it takes so much space
    TC =O(n)* SC=O(n) */
    private static void find2(int ar[]) {

        int n = Arrays.stream(ar).max().getAsInt();
        int count[] = new int[n];

        for (int i = 0; i < n; i++) {
            count[ar[i] - 1]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println("Repeated element: " + (i + 1));
            }
            if (count[i] == 0) {
                System.out.println("Missing element: " + (i + 1));
            }
        }

    }
}
