package CodingNinjas;

import java.util.Scanner;
/*

Fibonacci series - series of num in which third no is the sum of first two numbers;
how to check if a number is a part of fibonacci series
check (5*n*n + 4) || (5*n*n - 4) is a perfect square;

 */


public class Fibonacci {

    public static boolean isPerfectSquare(int n){
        int s= (int) Math.sqrt(n);
        return s*s==n;
    }

    public static boolean checkPart(int n){

        return ( isPerfectSquare(5*n*n+4) || isPerfectSquare(5*n*n-4) );

    }

    public static void printFibo(int n){

        int n1=0,n2=1,n3;
        System.out.print(n1 + " "+n2 +" ");
        for(int i=2;i<n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+ " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
//        int n= sc.nextInt();
//
//        printFibo(n);
        int check_Value= sc.nextInt();
        System.out.println(checkPart(check_Value));

    }

}
