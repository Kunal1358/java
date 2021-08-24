package Notes.day1.basics;

public class First_Code {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


/*

* Flow of execution  *

java code -> compiler -> byte code
simple.java -> compiler -> simple.class

* Keywords *

Class  ->          Keyword used to declare class in java.
Public ->          It is an access modifier which represents visibility. it means it is visible to all
static ->          When an method is declared static it is known as static method. Main advantage of static method
                     is that there is no need to create an object to invoke static method. main() method is executed
                     by JVM so there is no need to create an object to invoke main method. So it saves memory.
void ->            It is the return type of the method it doesn't return any value.
main ->            Represents the starting point of program.
string args[] ->   Used to command line arguments.

System.out.print(); -> Used to print a statement.
                       System is a class
                       out is the object of PrintStream class
                       Print() is the method of PrintStream class.

* Flow of execution  *

Class file
Class loader
Byte code verified
interpreter
Runtime
Hardware

 */

