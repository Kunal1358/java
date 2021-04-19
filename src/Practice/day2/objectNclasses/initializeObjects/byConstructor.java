package Practice.day2.objectNclasses.initializeObjects;

public class byConstructor {
    public static void main(String[] args) {

        B b=new B(8,"Kunal");

        System.out.println(b.name + " " +b.id );
    }
}

class B{

    protected int id;
    protected String name;

    B(int id,String name){
        this.id=id;
        this.name=name;
    }
}
