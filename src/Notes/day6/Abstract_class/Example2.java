package Notes.day6.Abstract_class;


abstract class Bike{

    Bike(){
        System.out.println("Bike is Created");
    }
    abstract void run();
    void change_gear(){
        System.out.println("gear_Changed");
    }
}

class honda extends Bike{
    void run(){
        System.out.println("Bike is running");
    }
}

public class Example2 {

    public static void main(String[] args) {

        honda obj=new honda();
        obj.run();
        obj.change_gear();
    }

}
