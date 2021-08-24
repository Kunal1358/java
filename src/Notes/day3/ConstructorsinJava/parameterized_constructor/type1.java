package Notes.day3.ConstructorsinJava.parameterized_constructor;

public class type1 {
    public static void main(String[] args) {
        practice obj = new practice(1,"kunal");
        practice obj1 = new practice(2,"raj");
        practice obj2 = new practice(3,"akbar");

        obj.display();
        obj1.display();
        obj2.display();
    }
}

class practice {

    private int id;
    private String name;

    practice(int id,String name){
        this.id=id;
        this.name=name;
    }

    void display()
    {
        System.out.println("id = " + id + "  name = " + name);
    }

}