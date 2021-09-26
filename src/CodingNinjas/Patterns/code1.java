package CodingNinjas.Patterns;

import java.util.Scanner;

public class code1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

//        //Pattern 1
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
        //Pattern 2
//        for(int i=1;i<=n;i++){
//
//            for(int j=n;j>=i;j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        //pattern 3
//        for(int i=1;i<=n;i++){
//
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        //Pattern 3

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
