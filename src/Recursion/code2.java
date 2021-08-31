package Recursion;

// sum of digits

public class code2 {

    public static void main(String[] args) {
        int num=12345;

        System.out.println(sum(num));
    }

    static int sum(int n) {

        return n==0?0: n%10+sum(n/10);
    }
}
