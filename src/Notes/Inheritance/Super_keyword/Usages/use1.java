package Notes.Inheritance.Super_keyword.Usages;

// Used to access parent class data members.

class Animal{
    String color="white";
}

class dog extends Animal{

    String color="Black";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class use1 {
    public static void main(String[] args) {
        dog d=new dog();
        d.printColor();
    }

}
