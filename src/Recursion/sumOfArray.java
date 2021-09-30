package Recursion;

public class sumOfArray {

    public static int sumOfArray(int arr[],int si){

        if(si== arr.length){
            return 0 ;
        }
        return arr[si]+sumOfArray(arr,si+1);
    }

    public static int sum(int arr[]){
        return sumOfArray(arr,0);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(sum(arr));
    }

}
