package DataStructures.Arrays.Code;

// Reverse a Array

public class Code12 {

    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        int temp;

        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }

    static void printArray(int arr[],
                           int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        reverse(arr);
        printArray(arr,6);

    }

}
