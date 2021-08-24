package Notes.day4.this_keyword.Usages;

public class Usage3_1 {

    public static void main(String[] args) {
        student obj=new student(1,"Kunal","C.S.E");
        student obj1=new student(1,"Kunal","C.S.E",700000f);
        obj.display();
        obj1.display();
    }

}

class student{
    int id;
    String name;
    float fee;
    String branch;

    student(int id,String name , String branch){
        this.id=id;
        this.branch=branch;
        this.name=name;
    }

    student(int id,String name , String branch, float fee) {
        // Reusing constructor
        this(id, name, branch);
        this.fee=fee;
    }

    void display(){
        System.out.println("Id = " + id + "  Name = " + name + "  branch = " + branch + "  Fee = " + fee );
    }

}


/*

Note ->
        Call to this() must be the first statement in constructor.
        otherwise it will give compile time error.

 */