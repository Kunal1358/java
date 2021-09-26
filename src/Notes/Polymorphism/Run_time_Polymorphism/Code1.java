package Notes.Polymorphism.Run_time_Polymorphism;

class  Bike{
    int speed=100;
}

class honda extends Bike{
    int speed=800;
}

public class Code1 {
    public static void main(String[] args) {
        Bike b=new honda();
        System.out.println(b.speed);
    }
    // methods -> object
    // data members -> reference
}

/*

Since we are accessing the data member which is not overridden, hence it will access the data member of the Parent class always.

Rule: Runtime polymorphism can't be achieved by data members.

 */
