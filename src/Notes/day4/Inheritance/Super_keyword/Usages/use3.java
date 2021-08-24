package Notes.day4.Inheritance.Super_keyword.Usages;

class x{
    x(){
        System.out.println("inside X");
    }
}

class y extends x{
    y(){
       // super();
        System.out.println("Inside Y");
    }
}

public class use3 {

    public static void main(String[] args) {
        y y=new y();
    }
}

/*

if we remove super() java compiler automatically adds calls supper class constructor.

 */