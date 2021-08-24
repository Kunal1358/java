package OOPs.Abstracion.Interface;

interface X{
    void draw();
}

interface Y{
    void draw();
}


public class MultipleInheritance2 implements X,Y{
    public static void main(String[] args) {
        MultipleInheritance2 obj=new MultipleInheritance2();
        obj.draw();
    }

    @Override
    public void draw() {
        System.out.println("Multiple Inheritance");
    }
}
