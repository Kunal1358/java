package Notes.basics;

public class java_datatype {

    public static void main(String[] args) {
        System.out.println("data types");
    }
}

/*

* Data Types *

There are 2 data types

Primitive     -> byte,int,short,float etc
non primitive -> classes,interface and arrays (Reference/Object Data Types)


primitive data types are the predefined data types of Java. They specify the size and type of any standard values
Non-primitive types are created by the programmer and is not defined by Java (except for String ).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.

A primitive type has always a value, while non-primitive types can be null .

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