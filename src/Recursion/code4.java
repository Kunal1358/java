package Recursion;

// Power of a number

public class code4 {

    public static void main(String[] args) {

        int num=2,pow=2;
        System.out.println(pow(3,3));
    }

    static int pow(int num,int exp){

        if(exp==0){
            return 1;
            // as num^0 is 1
        }
        else
            return num*pow(num,exp-1);

    }

}
