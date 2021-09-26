package CodingNinjas;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        int count = 2, curr;
        boolean isDec = true;

        while (count<=n){
            curr= sc.nextInt();
            count++;

            if(prev==curr){
                System.out.println("False");
                return;
            }
            if(curr<prev){
                if(isDec==false){
                    System.out.println("False");
                    return;
                }
            }
            else {
                if(isDec==true){
                    isDec=false;
                }
            }
            prev=curr;

        }
        System.out.println("True");
    }

}
