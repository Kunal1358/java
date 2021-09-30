package Algorithms.Sorting.QuickSort;

public class QuickSortCode {

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[si];
        int countSmaller=0;
        for(int i=si+1 ;i<= ei; i++){
            if(arr[i]<=pivot){
                countSmaller++;
            }
        }

        int pivotIndex=countSmaller+si;
        arr[si]=arr[pivotIndex]; // Added element at pivotIndex to si
        arr[pivotIndex]= pivot; // Added pivot element to pivot index;

        int i=si;
        int j=ei;
        while (i< pivotIndex && j>pivotIndex){

            if(arr[i]<=pivot){
                i++;
            }else if(arr[j]>pivot){
                j--;
            }else {
                System.out.println("swap");
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }return pivotIndex;
    }

    public static void  quick_Sort(int arr[],int si,int ei){

        if(si>=ei){ // is only 1 element is there or array is empty return
            return;
        }
        int p= partition(arr,si,ei);
        quick_Sort(arr,si,p-1);
        quick_Sort(arr,p+1,ei);
    }

    public static void main(String[] args) {

        int arr[]={1,9,3,5,6,3,};
        quick_Sort(arr,0, arr.length-1);

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
/*

 Time complexity

 Best - O(nlogn)
 Average - O(nlogn)
 worst - O(n*n)

 space complexity
 Worst O(nlogn)

*/