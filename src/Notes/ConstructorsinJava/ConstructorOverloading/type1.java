package Notes.ConstructorsinJava.ConstructorOverloading;

public class type1 {
    public static void main(String[] args) {

        student obj1= new student(1,"kunal");
        obj1.display();
        student obj2=new student(1,"Raj","Cse");
        obj2.display();
    }
}

class student{

    private int id;
    private String name;
    private String branch;

    //Constructor 1
    student(int id,String name){
        this.id=id;
        this.name=name;
    }

    //Constructor 2
    student(int id,String name,String branch){
        this.id=id;
        this.name=name;
        this.branch=branch;
    }

    void display(){
        System.out.println("Name = "+ name + "  Id = "+ id + "  Branch = " + branch);
    }

}
