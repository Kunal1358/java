package Notes.Inheritance.Super_keyword.Usages;


// Used to call parent class methods.

class student{
void a(){
    System.out.println("Inside Animal");
}
}

class cat extends student{
    void a(){
        System.out.println("inside cat");
    }
    void b(){
        System.out.println("Inside B");
    }

    void work(){
        super.a();
        b();
    }

}

public class use2 {
    public static void main(String[] args) {
        cat c=new cat();
        c.work();
    }
}
