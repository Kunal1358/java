package Recursion;

public class NoOfDigits {

    public static int noOfDigits(int n){

        if(n<=0){
            return 0;
        }
        int num=noOfDigits(n/10);
        return num+1;
    }

    public static void main(String[] args) {
        System.out.print(noOfDigits(000));
    }

}
