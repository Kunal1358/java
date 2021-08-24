package OOPs.Abstracion.AbstractClass;

abstract class bike{
    int x,y;
    void run(){
        System.out.println("Bike is running");
        System.out.println("x = "+x +"y = "+ y);
    }

    abstract void show();

    bike(){
        System.out.println("Default ctr of class bike ");
    }

}

public class code1 extends bike{


    void show(){
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {

        // bike obj=new bike();
        //  this line will give error as abstract class can not be instanciated.
        //  it can only be extended and used

        bike obj=new code1();

        obj.show();
        obj.run();
    }
}
