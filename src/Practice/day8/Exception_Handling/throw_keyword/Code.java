package Practice.day8.Exception_Handling.throw_keyword;

public class Code {

    public static void main(String[] args) {
        validate(14);
    }

    static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not valid");
        }else {
            System.out.println("Welcome to vote");
        }
    }
}
