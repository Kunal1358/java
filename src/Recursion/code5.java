package Recursion;

// fibonacci Series

public class code5 {

    public static void main(String[] args) {

        int num=5;

        for(int i=0;i<10;i++) {

            System.out.print(fibo(i)+ " ");
        }
    }
    static int fibo(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return (fibo(n-1)+fibo(n-2));
    }

}
