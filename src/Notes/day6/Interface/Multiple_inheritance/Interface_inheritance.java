package Notes.day6.Interface.Multiple_inheritance;

interface printable{
    void print();
}

interface showable extends printable{
    void show();
}

class call implements showable{
    public void print(){
        System.out.println("Printed");
    }
    public void show(){
        System.out.println("showing");
    }
}

public class Interface_inheritance {

    public static void main(String[] args) {
        call c = new call();
        c.print();
        c.show();
    }

}
