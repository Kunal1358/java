package OOPs.Abstracion.AbstractClass;

abstract class shape{
    abstract void draw();
    static void stat(){
        System.out.println("static method");
    }
}

class rect extends shape{

    void draw() {
        System.out.println("drawing rect");
    }
}

class circle extends shape{

    void draw() {
        System.out.println("drawing circle");
    }

}

public class code2 {
    public static void main(String[] args) {
        shape obj=new rect();
        obj.draw();
        shape.stat(); // we can call static methods by this

    }
}
