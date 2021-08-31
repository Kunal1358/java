package BasicCodes;

// Reverse of a number

public class code2 {

    public static void main(String[] args) {

        int num=123;

        int rev_num=0;
        int rem=0;

        while(num!=0){
            rem=num%10;
            rev_num=rev_num*10+rem;
            num/=10;
        }
        System.out.println(rev_num);
    }
}
