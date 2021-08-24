package OOPs.polymorphism.Static;


class stat{

    static void display(){
        System.out.println("static display with no arg");
    }
    static void display(int z){
        System.out.println("z = "+ z);
    }


}

public class staticOverloading {

    public static void main(String[] args) {

    stat.display();
    stat.display(2);

    }
}
