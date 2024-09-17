package class20_binary_search;

public class FindTarget {
    public static void main(String[] args) {
        int ar[]={2,4,6,8,10,14};
        int ar1[]={30,28,20,16,4};
       /* int target = 10;
        int index=find(ar, target);*/
        int target1 = 16;
        int index=find1(ar1, target1);
        if(index!=-1)
            System.out.println("Its Present at "+index);
        else
            System.out.println("Its not present!");

    }

    private static int find(int ar[], int target) {
        int n = ar.length;
        int mid = 0;
        int start = 0;
        int end = n - 1;
        while (start <= end) {

           /* mid = (start + end) / 2;
            An overflow error will occur
          because an integer can hold only a certain maximum value
          2^31 - 1 (2,147,483,647) if we add start+end it can be larger than
           2^31 - 1 (2,147,483,647) which can not be hold by int variable because
           its 4 byte */
            mid=start+(end-start)/2;
            /*
            (2*start+(end-start))/2 => (2*start-start+end)/2 => (start+end)/2
             */


            if (ar[mid] == target) {
                return mid;
            } else if (target > ar[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    private static int find1(int ar[], int target) {
        int n = ar.length;
        int mid = 0;
        int start = 0;
        int end = n - 1;
        while (start <= end) {

           /* mid = (start + end) / 2;
            An overflow error will occur
          because an integer can hold only a certain maximum value
          2^31 - 1 (2,147,483,647) if we add start+end it can be larger than
           2^31 - 1 (2,147,483,647) which can not be hold by int variable because
           its 4 byte */
            mid=start+(end-start)/2;
            /*
            (2*start+(end-start))/2 => (2*start-start+end)/2 => (start+end)/2
             */


            if (ar[mid] == target) {
                return mid;
            } else if (target > ar[mid]) {
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }
        return -1;
    }
}
