package Notes.day2.objectNclasses.initializeObjects;

public class reference_variable {

    public static void main(String[] args) {

        check check=new check();
        check.id=8;
        check.name="Kunal";

        System.out.println(check.name +" " + check.id);
    }
}

class check{
    int id;
    String name;
}
