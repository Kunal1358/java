package OOPs.Abstracion.Interface;

//By default interface add public static final keywords before data Variables.
//By default interface add public and abstract keywords before methods.

interface shape{
    void draw();
}

class circle implements shape{
    public void draw(){
        System.out.println("Printing");
    }
}

public class Code1 {

    public static void main(String[] args) {
        shape obj=new circle();
        obj.draw();
    }

}
