package CodingNinjas;

import java.util.Scanner;

public class powerOfNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int pow= sc.nextInt();

        int ans=1;
        while (pow>0){
            ans*=num;
            pow--;
        }
        System.out.println(ans);

    }

}
