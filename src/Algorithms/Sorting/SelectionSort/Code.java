package Algorithms.Sorting.SelectionSort;

public class Code {

    public static void SelectionSort(int arr[]){
        int n=arr.length;

       for(int i=0;i<n-1;i++){
           int min=arr[i];
           int minIndex=i;
           for(int j=i+1;i<n;j++){
               if(arr[j]<min){
                   minIndex=j;
                   min=arr[j];
               }
           }
           arr[minIndex]=arr[i];
           arr[i]=min;
       }

    }

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[]=new int[]{0,7, 2, 5, 4, 7, 1, 3, 6};

        SelectionSort(arr);
        print(arr,arr.length);


    }
}
