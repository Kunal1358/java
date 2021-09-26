package CodingNinjas;

import java.util.Scanner;

public class FindDuplicate {

    public static int duplicate(int arr[],int n) {

        int sum = 0;
        int sumOfArray = 0;

        sum = ((n - 2) * (n - 1)) / 2;

        for (int i = 0; i < n; i++) {
            sumOfArray += arr[i];
        }
        return sumOfArray - sum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.println(duplicate(arr,arr.length));

    }

}
