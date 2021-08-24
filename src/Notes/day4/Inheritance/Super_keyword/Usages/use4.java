package Notes.day4.Inheritance.Super_keyword.Usages;

class persons{
    int id;
    String name;

    persons(int id,String name){
        this.id=id;
        this.name=name;
    }

}

class emp extends persons{

    float salary;

    emp(int id, String name , float salary){
        super(id, name);
        this.salary=salary;
    }

    void display(){
        System.out.println("Name = " + name + "  id = " + id + "  salary = " + salary);
    }
}

public class use4 {
    public static void main(String[] args) {

        emp e1=new emp(111,"raj",500f);
        e1.display();
    }
}
