package Practice.day4.this_keyword.Usages;

public class Usage6 {
    public static void main(String[] args) {

        new X().getX().msg();

    }
}

class X{

    X getX(){
        return this;
    }

    void msg(){
        System.out.println("Usage 6");
    }

}

/*

we can return this keyword as a statement from method.
In such case return type of method must be same as  class type.


 */