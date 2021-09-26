package CodingNinjas.Patterns;

import java.util.Scanner;

public class CharPattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        // Pattern 1
//        for(int i=1;i<=n;i++){
//            char ch=(char)('A'+i-1);
//            for(int j=1;j<=n;j++){
//                System.out.print(ch + " ");
//                ch++;
//            }
//            System.out.println();
//        }

        //Pattern 2
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print((char)('A'+j-1)+" ");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=n;i++){
            char ch= (char) ('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }



    }

}

/*

A B C D
B C D E
C D E F
D E F G


A B C D
A B C D
A B C D
A B C D


 */