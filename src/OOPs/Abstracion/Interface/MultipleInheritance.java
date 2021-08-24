package OOPs.Abstracion.Interface;

interface A{
    void draw();
}

interface B{
    void show();
}

class example implements A,B{

    @Override
    public void show() {
        System.out.println("Hello");
    }

    @Override
    public void draw() {
        System.out.println("Welcome");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        example obj=new example();
        obj.show();
        obj.draw();
    }


}
