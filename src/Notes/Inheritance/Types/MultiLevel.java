package Notes.Inheritance.Types;

class animal{
    void eat(){
        System.out.println("eating");
    }

}

class Dog extends animal{
    void bark(){
        System.out.println("barking");
    }

}

class babyDog extends Dog{
    void sleep(){
        System.out.println("sleeping");
    }

}

public class MultiLevel {

    public static void main(String[] args) {

        babyDog obj=new babyDog();
        obj.sleep();
        obj.eat();
        obj.bark();

    }
}
