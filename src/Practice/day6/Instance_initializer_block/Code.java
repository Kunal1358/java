package Practice.day6.Instance_initializer_block;

class A{

    int speed;

    A(){
        System.out.println("Speed = " + speed);
    }

    {speed=100;} // Instance initializer block
}

public class Code {
    public static void main(String[] args) {
        A a=new A();
    }
}
