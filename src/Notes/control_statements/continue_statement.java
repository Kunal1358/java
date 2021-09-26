package Notes.control_statements;

public class continue_statement {

    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip this condition and return the control back to the for loop
            }
            System.out.println(i);
        }
    }
}

/*

it will skip rest part of loop and continue on the flow to the top of loop.

 */
