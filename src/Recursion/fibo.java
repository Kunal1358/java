package Recursion;

public class fibo {

    public static int printFibo(int n){

        if(n==0 || n==1){
            return n;
        }
        return printFibo(n-1)+printFibo(n-2);
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++)
        System.out.print(printFibo(i)+" ");
    }
}
