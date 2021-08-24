package Notes.day6.Covariant_Return_Type;

class A{
    A get(){
        return this;
    }
}

class B extends A{
    B get(){
        return this;
    }
    void msg(){
        System.out.println("Welcome to Covariant Return Type");
    }
}

public class Code1 {
    public static void main(String[] args) {
        new B().get().msg();
    }
}


/*

the return type of the get() method of A class is A but the return type of the get()
method of B class is B. Both methods have different return type but it is method
overriding. This is known as covariant return type.

 */