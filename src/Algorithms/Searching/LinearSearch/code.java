package Algorithms.Searching.LinearSearch;

public class code {

    static int search(int[] arr, int num) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;

        System.out.println(search(arr,x));

        }
}

/*

Time Complexity - O(N) // we generally talk about average

Best case - O(1)
Average - O(N)
Worst - o(N)

 */
