package Practice.day8.Scanner;

import java.util.Scanner;

public class Code1 {

    public static void main(String[] args) {

        String str = "Hello/This is Java Practice/My name is Kunal.";

        Scanner sc=new Scanner(str);

//        while(sc.hasNext()){
//            System.out.println(sc.next());
//        }

        System.out.println("---Tokenized String---");

        sc.useDelimiter("/");

        while(sc.hasNext()){
            System.out.println(sc.next());
        }

        System.out.println(sc.delimiter());


    }
}


/*

Output

Hello/This
is
JavaTpoint/My
name
is
Abhishek.
---Tokenized String---
/

 */
