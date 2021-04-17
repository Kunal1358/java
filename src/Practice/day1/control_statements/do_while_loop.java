package Practice.day1.control_statements;

public class do_while_loop {

    public static void main(String[] args) {

        int a=3;

        do {
            System.out.println("Hello World");
            a--;
        }while (a>0);

        int k =3;

        do {
            System.out.println("Loop iterated once");
            k--;
        }while (k <0);
    }
}

/*

* examples of infinite loop

do{
}while(true);

do{
no inc/dec
}while(cond);

 */