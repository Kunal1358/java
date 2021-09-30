package Recursion;

public class power {

    public static int power(int num, int pow){

        if(num==0 && pow ==0){
            return 0;
        }
        if(num==0){
            return 0;
        }
        if(pow ==0){
            return 1;
        }


        return (num *power(num, pow -1));
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }

}
