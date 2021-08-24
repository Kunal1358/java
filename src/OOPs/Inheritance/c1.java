package OOPs.Inheritance;

/*

Static methods in Java are inherited, but can not be overridden. If you declare the same method in a subclass,
you hide the superclass method instead of overriding it. Static methods are not polymorphic. At the compile time,
 the static method will be statically linked.

 */

class a1{
    static void show(){
        System.out.println("inside A1");
    }
}

class a2 extends  a1{
    static void show(){
        System.out.println("inside A2");
    }
}


public class c1 {

    public static void main(String[] args) {
        a2.show();
        a2.show();
    }
}
