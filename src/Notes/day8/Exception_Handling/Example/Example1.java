package Notes.day8.Exception_Handling.Example;

public class Example1 {

    public static void main(String[] args) {

        int x=10;
        int ans;

        try{
            ans=10/0;

        }catch (Exception exception){
            System.out.println(exception);
        }
        finally {
            // executes if an exception is handled or not
            System.out.println("Check Your code");
        }

    }
}
