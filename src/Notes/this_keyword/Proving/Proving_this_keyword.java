package Notes.this_keyword.Proving;

public class Proving_this_keyword {

    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj);
        obj.m();

    }
}

class A{
    void m(){
        System.out.println(this);
    }
}

/*

O/P proves that this keyword refer to the current class instance variable

 */