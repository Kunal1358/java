package Notes.objectNclasses.initializeObjects;

public class byMethod {
    public static void main(String[] args) {

        method method=new method();

        method.initialize(8,"Kunal") ;

        System.out.println(method.name + " " + method.id);

    }
}

class method{
    int id;
    String name;

    void initialize(int id, String name){
        this.id=id;
        this.name=name;
    }

}
