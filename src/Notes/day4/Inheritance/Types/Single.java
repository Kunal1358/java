package Notes.day4.Inheritance.Types;

class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

public class Single {

    public static void main(String[] args) {

        dog d=new dog();
        d.bark();
        d.eat();

    }
}

/*

here we can use d.eat because class dog has inherited all the features of Animal class

 */

