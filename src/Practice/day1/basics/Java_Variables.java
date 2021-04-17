package Practice.day1.basics;

public class Java_Variables {
    public static void main(String[] args) {

    int a=10;
    float f=a;
        System.out.println("Widening ");
        System.out.println("a=10   " + a);
        System.out.println("f=a  " + f);

        System.out.println();
        System.out.println();

        //Typecasting

        float x =10.5f;
        int k=(int)x;

        System.out.println("Typecasting ");
        System.out.println("x =10.5f   " + x);
        System.out.println("k=(int)x;  " + k);

    }
}


/*

* Variables *

There are 3 types of variables
1-> Local
2-> Instance
3-> Static

Local variables -> variables declares inside the method. It cant be used outside the method body.
Instance Variable -> Variable declared inside the class but outside the method body.
                     It is called instance variable because its value is instance specific
                     and is not shared among instances.
Static variable -> It cannot be local. You can create a single copy of static variable and
                   share among all the instances of the class. Memory allocation for static
                   variable happens only once when the class is loaded in the memory.


class A{
    int x=1; // instance variable
    static int y =10; // static variable

    void show()
        {
            int k =100; // local variable
        }
}

* Data Types *

There are 2 data types

Primitive     -> byte,int,short,float etc
non primitive -> classes,interface and arrays

* * java uses Unicode system not ASCII code system. The \u0000 is the lowest range of Unicode system. * *


A particular code value corresponds to different letters in the various language standards.
The encodings for languages with large character sets have variable length.Some common characters
are encoded as single bytes, other require two or more byte.

To solve these problems, a new language standard was developed i.e. Unicode System.
In unicode, character holds 2 byte, so java also uses 2 byte for characters.
lowest value:\u0000
highest value:\uFFFF

* Float vs Double *

float  ->  single precision - 6 decimal digits  - low accuracy
double ->  double precision - 15 decimal digits - high accuracy

Default Data Type
	Float  -> Java does not use it as the default floating-point number.
    Double -> It is the default data type for floating-point numbers.

Suffix
    Float  -> It uses F or f as a suffix. It is mandatory to add a suffix if you are declaring a float variable.
    Double -> It uses d or D as a suffix. It is optional to add a suffix if you are declaring a double variable.


 */