package DataStructures.Arrays.Code;

// Largest and min

public class Code11 {

    static int largest(int arr[]){
        int largest=arr[0];

        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }

    static int smallest(int arr[]){
        int smallest=arr[0];

        for(int i=0;i< arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int arr[]=new int[] {4, 6, 5, -10, 8, 5, 20};

        System.out.println(largest(arr));
        System.out.println(smallest(arr));
    }

}
