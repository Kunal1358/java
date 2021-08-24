package OOPs.Class;


class A {
    void printA(){
        System.out.println("Class A");
    }
}

class B extends  A{
    void printB(){
        System.out.println("Class B");
    }
}

public class test {

    public static void main(String[] args) {

        A obj= new B();
        obj.printA();

    }

}
