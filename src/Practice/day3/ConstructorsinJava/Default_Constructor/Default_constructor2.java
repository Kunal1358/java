package Practice.day3.ConstructorsinJava.Default_Constructor;

public class Default_constructor2 {
    public static void main(String[] args) {
        display show =new display();

    }
}

class display{
    private int id;
    private String name;

    display(){
        System.out.println("id = "+ id +"  name = "+ name);
    }

}

/*

purpose of default constructor is to initialize null values to the objects.

 */