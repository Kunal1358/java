package Notes.day4.Inheritance.Types;

class A{
    void a(){
        System.out.println("Inside A");
    }
}

class B extends A{
    void b(){
        System.out.println("inside B");
    }
}

class C extends A{
    void c(){
        System.out.println("Inside c");
    }
}


public class Hierarchical {
    public static void main(String[] args) {

        B obj=new B();
        obj.b();
        obj.a();
        // obj.c; Error as this class in not inherited by class B

    }
}
