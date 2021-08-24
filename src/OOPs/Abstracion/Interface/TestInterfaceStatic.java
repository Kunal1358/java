package OOPs.Abstracion.Interface;

interface drawable{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}

class rect implements drawable{

    @Override
    public void draw() {
        System.out.println("drawing");
    }
}

public class TestInterfaceStatic {

    public static void main(String[] args) {
        drawable obj=new rect();
        obj.draw();
        System.out.println(drawable.cube(100));
    }
}
