package BasicCodes;

// Sum of digits
// Print digits of a number

public class code1 {

    public static void main(String[] args) {

        int num=333;
        int num2=333;

        int sum=0,n=0;

        while(num>0){
            n=num%10;
            sum=sum+n;
            num=num/10;
        }
        System.out.println(sum);

        // if we want to printDFS the single digit values

        while(num2>0){
            n=num2%10;
            System.out.print(n+" ");
            num2/=10;
        }


    }


}
