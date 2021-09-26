package Algorithms.Searching.BinarySearch;

public class CodingNinja {

    public static int BinarySerarch(int arr[],int start,int end,int elem){

        if(end>start) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem) {
                return mid;
            } else if (arr[mid] > elem) {
                return BinarySerarch(arr, mid + 1, end, elem);
            } else {
                return BinarySerarch(arr, start, mid - 1, elem);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]=new int[]{1 ,3, 5, 6, 8, 10, 14, 17};
        int search=6;
        System.out.println(BinarySerarch(arr,0,arr.length-1,search));


    }

}
