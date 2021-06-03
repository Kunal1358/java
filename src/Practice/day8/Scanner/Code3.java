package Practice.day8.Scanner;

import java.util.Scanner;

public class Code3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a=Integer.parseInt(sc.nextLine());
        String b=sc.nextLine();

        System.out.println(a);
        System.out.println(b);

    }
}
/*


Sol 1

        int a=sc.nextInt();
        sc.nextLine();        --------> Use nextLine to read a newline
        String b=sc.nextLine();

Sol 2
        int a=Integer.parseInt(sc.nextLine());  --> Use integer.parseInt()
        String b=sc.nextLine();


 */
