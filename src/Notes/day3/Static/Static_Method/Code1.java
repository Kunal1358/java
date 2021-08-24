package Notes.day3.Static.Static_Method;

public class Code1 {

    public static void main(String[] args) {



        Student obj = new Student(1,"Kunal");
        obj.display();

        obj.id=11;
        obj.name="kk";

        Student.clg_change();
        obj.display();

    }

}

class Student{

    int id;
    String name;
    static String Clg_name="Chitkara";

    static void clg_change(){
        Clg_name="BITS";
    }

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

     void display(){
        System.out.println("Id = " + id + "  Name = " + name+ "  Clg_name = " + Clg_name);
    }
}