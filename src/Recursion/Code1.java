package Recursion;


// Factorial of a number

public class Code1 {

    public static void main(String[] args) {

        int num=5;

        System.out.println(fact(5));

    }

    static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}


