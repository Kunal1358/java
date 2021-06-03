package Practice.day8.Exception_Handling.Example;

public class Example3 {
    public static void main(String[] args) {

        try{

            try{
                System.out.println("going to divide");
                int b=30/0;

            }catch (ArithmeticException exception){
                System.out.println(exception);
            }

                try {
                    int a[]=new int[5];
                    a[5]=4;
                }catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            System.out.println("other statement");
        }catch (Exception q){
            System.out.println("Handled");
        }

    }
}
