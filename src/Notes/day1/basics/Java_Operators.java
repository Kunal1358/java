package Notes.day1.basics;

public class Java_Operators {
    public static void main(String[] args) {

//Unary Operator
        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10

        System.out.println();
        System.out.println();

        int aa=10;
        int bb =10;
        System.out.println(aa++ + ++aa);//10+12=22
        System.out.println(bb++ + bb++);//10+11=21

        System.out.println();
        System.out.println();

// Arithmetic Operators
        int a=10;
        int b=5;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0

        System.out.println();
        System.out.println();

// Shift operators
        // right shift
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        //left shift
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2


        System.out.println();
        System.out.println();

        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);

        System.out.println();
        System.out.println();

//ternary operator

        int q=1;
        int w=2;
        int min =(q>w)?q:w;
        System.out.println(min);

    }
}


/*

* >> vs << *

left shift >> divide by 2*
right shift << multiply by 2*

* || vs | *

The logical || operator doesn't check second condition if first condition is true.
It checks second condition only if first one is false.

The bitwise | operator always checks both conditions whether first condition is true or false.


 */