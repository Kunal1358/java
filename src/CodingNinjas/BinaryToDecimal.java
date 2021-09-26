package CodingNinjas;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int dec=0;
        int pow=1;

        while(num>0){
            int last=num%10;
            dec+=last*pow;
            pow*=2;
            num/=10;
        }


        System.out.println(dec);
    }

}
