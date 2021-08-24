package OOPs.polymorphism.Static.Constructor;

//Constructor overloading

class student{
    int id;
    String name;
    String branch;

    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    void print(){
        System.out.println("Id = "+ id +" Name = "+ name +" Branch = "+ branch);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        student obj=new student(1,"a");
        student obj1=new student(1,"a","Cse");
        obj.print();
        obj1.print();
    }
}
