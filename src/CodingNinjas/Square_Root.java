package CodingNinjas;

import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int ans=0;

        while (ans*ans<=num){

            ans+=1;
        }


        System.out.println(ans-1);

    }
}
