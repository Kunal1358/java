package CodingNinjas;

import java.util.Scanner;

public class ArrayEquilibrium {

    public static int ArrayEquilibrium(int arr[],int n){

        int totalSum=0;
        int leftSum=0;
        int rightSum=0;

        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }


        for(int i=0;i<n;i++){
            rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(ArrayEquilibrium(arr,arr.length));
    }

}
