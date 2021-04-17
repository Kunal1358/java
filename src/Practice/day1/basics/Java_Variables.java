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

 */