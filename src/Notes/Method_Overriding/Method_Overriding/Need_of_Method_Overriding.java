package Notes.Method_Overriding.Method_Overriding;


class Vehicle{
    void run(){
        System.out.println("In Parent Class");
    }
}

class car extends Vehicle{
    void run(){
        System.out.println("Inside Child Class");
    }

}

public class Need_of_Method_Overriding {
    public static void main(String[] args) {

        car obj=new car();
        obj.run();

    }

}
