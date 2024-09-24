package class20_binary_search;

public class BookAllocation {
    public static void main(String[] args) {


        int books[]={12,34,67,90};
        int students=2;
        int minOfMaxPages= findPages(books,students);
        System.out.println("Minimum of max pages: "+minOfMaxPages);
    }
    private static int findPages(int books[],int students){

        int n=books.length;
        if(students>n){
            return -1;
        }
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<n;i++){
            start=Math.max(start, books[i]);
            end+=books[i];
        }

        System.out.println("start : "+start +" end : "+end);
        int mid=0;
        int result=0;
        while(start<=end){
            mid=start+(end-start)/2;
            int studentCount=1;
            int pages=0;
            for(int i=0;i<n;i++){

                pages+=books[i];
                if(pages>mid){
                    studentCount++;
                    pages=books[i];

                }
            }
            if(studentCount<=students){
                result=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
}
