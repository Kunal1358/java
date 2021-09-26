package Notes.ConstructorsinJava.Default_Constructor;

public class Default_constructor {

    public static void main(String[] args) {

        show show = new show();

    }

}

class show{
    show() {
        System.out.println("Default Constructor");
    }
}

// default ctr is called when the new keyword is used.
// It will execute the code inside that statement.