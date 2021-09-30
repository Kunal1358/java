package Recursion;

public class ContainsX {
    public static boolean ContainsX(int arr[],int si,int x){

        if(si== arr.length){
            return false ;
        }
        if(arr[si]==x){
            return true;
        }
        return ContainsX(arr,si+1,x);
    }

    public static boolean conatin(int arr[],int x){
        return ContainsX(arr,0,x);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(conatin(arr, 5));
    }
}


