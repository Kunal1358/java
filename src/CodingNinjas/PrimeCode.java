package CodingNinjas;
import java.util.Scanner;

/*

Prime no is a number that has only two multiple 1 and the no itself

 */

public class PrimeCode {

    public static void prime(int value){
        int flag=1;

        for(int i=2;i<value-1;i++){
            if(value%i==0){
                flag=0;
            }
        }
        if(flag==0)
            System.out.println("Not a prime");
        else
            System.out.println("Prime");
    }

    public static void primeInRange(int si,int ei){


        for(int i=si;i<ei;i++){

            int flag=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                }
            }
            if(flag!=0){
                System.out.print(i+" ");
            }

        }

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
//        int value= sc.nextInt();
       // prime(value);
        primeInRange(1,100);


    }



}
