package CodingNinjas.Patterns;

import java.util.Scanner;

public class ReversePattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        //Pattern 1
//        for(int i=n;i>=1;i--){
//            int num=i;
//            for(int j=1;j<=i;j++){
//
//                System.out.print(num-- +" ");
//            }
//            System.out.println();
//        }

        //Pattern 2
        for(int i=1;i<=n;i++){
            char ch= (char) ('A'+n-i);
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
        }


    }

}
/*

4 3 2 1
3 2 1
2 1
1


 */