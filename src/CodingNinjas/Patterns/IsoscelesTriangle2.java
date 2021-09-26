package CodingNinjas.Patterns;

// Lec 6

import java.util.Scanner;

public class IsoscelesTriangle2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int print=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print(print++);
            }

            System.out.println();
        }

    }

}
