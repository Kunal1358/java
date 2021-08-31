package Recursion;

// Dec to binary

public class Code3 {

    public static void main(String[] args) {
        int num =45;
        dectobin(num);
    }

    static void dectobin(int n){
        if(n==0){
            return;
        }else {
            dectobin(n/2);
            System.out.print(n%2+ " ");
        }
    }

}
