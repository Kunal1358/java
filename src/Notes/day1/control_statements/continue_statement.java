package Notes.day1.control_statements;

public class continue_statement {

    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }
    }
}

/*

it will skip rest part of loop and continue on the flow to the top of loop.

 */
