package Algorithms.Sorting.MergeSort;

public class MergeSortCode {

    public static void MergeSort(int arr[],int si,int ei){

        if(si>=ei){ // si<ei array is empty || si = ei only 1 element in array, Array is sorted
            return;
        }
        int mid=(si+ei)/2;
        MergeSort(arr,si,mid); // left half
        MergeSort(arr,mid+1,ei); // right half

        Merge(arr,si,ei);
    }

    public static void Merge(int arr[],int si,int ei){
        System.out.println("Merge called");
        int size=ei-si+1;
        int mid=(si+ei)/2;
        int output[]=new int[size];
        int i=si; // starting index of left array
        int j=mid+1; // starting index of left array
        int k=0; // for output array

        while (i<=mid && j<=ei){ // sorting elements and storing in output
            if(arr[i]<arr[j]){
                output[k]=arr[i];
                i++;
                k++;
            }else{
                output[k]=arr[j];
                j++;
                k++;
            }
        }

        // to copy remaining elements in output
        // only one loop will work as only 1  array will be left with remaining elements.
        while(i<=mid){
            output[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            output[k]=arr[j];
            j++;
            k++;
        }
        // copying output in our original array
        int m=0;
        for(int x = si; x <=ei; x++){
            arr[x]=output[m];
            m++;
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        MergeSort(arr,0, 6-1);

        for(int i=0;i< 6;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}

/*

// Merge function will be called n-1 times to sort the array
// Also called n-1 times if array is sorted

Time complexity

Best - O(nlogn)
Average - O(nlogn)
worst - O(nlogn)

space complexity
Worst O(n)

 */