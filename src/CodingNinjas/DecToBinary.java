package CodingNinjas;

import java.util.Scanner;

public class DecToBinary {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int bin=0;
        int pow=1;

        while(num>0){
            int last=num%2;
            bin+=last*pow;
            pow*=10;
            num/=2;
        }
        System.out.println(bin);
    }
}
