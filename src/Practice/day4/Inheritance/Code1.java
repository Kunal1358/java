package Practice.day4.Inheritance;

class Employee{
    float salary =500;
}

public class Code1 extends Employee {

    int bonus=10;

    public static void main(String[] args) {

        Code1 obj= new Code1();
        System.out.println(obj.bonus);
        System.out.println(obj.salary);
    }

}

// Employee class is extended by code1 class to inherit it features.