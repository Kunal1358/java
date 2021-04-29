package Practice.day6.Instance_initializer_block;


class Num{
    Num(){
        System.out.println("parent ctr");
    }
}

class num1 extends Num {
    public num1() {
        super();
        System.out.println("child ctr");
    }

    num1(int a) {
        super();
        System.out.println("child  method   " + a);
    }

    {System.out.println("instance initializer block");}
}

public class Code4 {

    public static void main(String[] args) {
        num1 n=new num1();
        num1 n1=new num1(10);
    }
}
