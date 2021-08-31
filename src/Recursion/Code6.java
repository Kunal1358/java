package Recursion;

// GCD

public class Code6 {

    public static void main(String[] args) {

        System.out.println(gcd(366,60));

    }

    static int gcd(int m,int n){
        if(n==0)
            return m;
        else return gcd(n,m%n);
    }

}
