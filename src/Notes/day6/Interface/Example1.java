package Notes.day6.Interface;

interface printable{
    void print();
}

class A implements printable{
    public void print(){
        System.out.println("printable");
    }
}

public class Example1 {

    public static void main(String[] args) {
        A a =new A();
        a.print();
    }
}
