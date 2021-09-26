package CodingNinjas;

import java.util.Scanner;

public class sumOfEverOdd {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        int oddSum=0;
        int evenSum=0;

        while(num>0){

            int rem=num%10;
            if(rem%2==0){
                evenSum+=rem;
            }else{
                oddSum+=rem;
            }
            num/=10;
        }

        System.out.println("Even Sum is "+ evenSum);
        System.out.println("Odd Sum is "+ oddSum);


    }

}
