package Notes.control_statements;

public class break_statements {
    public static void main(String[] args) {
        System.out.println("break");

        for(int i=0;i<10;i++){
            if(i==5)
                break;
            System.out.println(i);
        }

    }
}

/*

used to stop the execution of loop
it only stops the inner loop and control goes back to outer loop.

 */