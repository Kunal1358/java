package CodingNinjas;

import java.util.Scanner;

public class FindUnique {

    public static int unique(int arr[]){
        int n=arr.length;
        int Xor=0;
        for(int i=0;i<n;i++){
            Xor^=arr[i];
        }
        return Xor;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(unique(arr));

    }

}

/*
Works in o(n) complexity
return min element if more than 1 unique element is there

 */
