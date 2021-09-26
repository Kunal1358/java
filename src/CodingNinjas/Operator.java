package CodingNinjas;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int f= sc.nextInt();
      //  int c=(5/9)*(f-32); // 0 as it will give the integer part not the value after the points

        //Sol 1
      //  int c= ( 5*(f-32))/9;

        //Sol 2
        int c=(int)((5.0/9)*(f-32));

        System.out.println(c);

    }

}
