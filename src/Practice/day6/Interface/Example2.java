package Practice.day6.Interface;

interface shapes{
    void draw();
}

class square implements shapes{
    public void draw(){
        System.out.println("Square is drawn");
    }
}

class circle implements shapes{
    public void draw(){
        System.out.println("Circle is drawn");
    }

}

public class Example2 {

    public static void main(String[] args) {
        shapes c= new square();
        c.draw();
    }

}
