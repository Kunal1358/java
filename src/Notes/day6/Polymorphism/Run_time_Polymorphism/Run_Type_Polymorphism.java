package Notes.day6.Polymorphism.Run_time_Polymorphism;


class A{
    void run(){
        System.out.println("Parent Class Method called");
    }
}

class B extends A{
    void run(){
        System.out.println("Child Class Method Called");
    }
}


public class Run_Type_Polymorphism {

    public static void main(String[] args) {
        A obj=new B();
        obj.run();
    }
}
