package CodingNinjas.Patterns;

import java.util.Scanner;

public class DecPattern {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            int temp=i;
            for(int j=1;j<=i;j++){
                System.out.print(temp-- +" ");
            }
            System.out.println();
        }


    }
}
/*

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1


 */