package OOPs.polymorphism.dynamic;


class Vehicle{
    //defining a method
    void run(){System.out.println("Vehicle is running");}
}

//Creating a child class
class MethodOverriding extends Vehicle{
    //defining the same method as in the parent class
    void run(){System.out.println("Bike is running safely");}

    public static void main(String args[]){
        MethodOverriding obj = new MethodOverriding();//creating object
        obj.run();//calling method
    }
}


//    We can only use those access specifiers
//        in subclasses that provide larger access than the access specifier of the superclass.