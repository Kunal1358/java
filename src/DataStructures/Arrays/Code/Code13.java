package DataStructures.Arrays.Code;

// Sort an array

public class Code13 {

    static void sort(int arr[]){

        int temp;

        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    static void print(int arr[]){
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] arr = new int [] {5, 2, 8, 7, 1};
        sort(arr);
        print(arr);

    }

}
