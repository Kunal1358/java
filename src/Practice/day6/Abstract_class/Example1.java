package Practice.day6.Abstract_class;

abstract class A{
    abstract void run();
}

class B extends A{
    void run(){
        System.out.println("Abstract Class");
    }
}

public class Example1 {
    public static void main(String[] args) {

        B a =new B();
        a.run();

    }
}
