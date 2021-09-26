package CodingNinjas;

import java.util.Scanner;

public class Ap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
//        int c= sc.nextInt();

        int count=1;

        int i=1;
        while(count<n){

            int val=i*3+2;
            if(val%4!=0){
                System.out.print(val+ " ");
                count++;
            }

            i++;
        }


    }

}
