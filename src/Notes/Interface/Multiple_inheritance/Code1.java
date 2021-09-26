package Notes.Interface.Multiple_inheritance;

interface A{
    void print();
}
interface B{
    void print2();
}

class C implements A,B{
    public void print(){
        System.out.println("Print 1");
    }
    public void print2(){
        System.out.println("Print 2");
    }
}


public class Code1 {
    public static void main(String[] args) {
        C c=new C();
        c.print();
        c.print2();
    }
}
