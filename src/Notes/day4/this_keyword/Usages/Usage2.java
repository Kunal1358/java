package Notes.day4.this_keyword.Usages;

public class Usage2 {

    public static void main(String[] args) {

        use2 obj=new use2();
        obj.n();
    }
}

class use2{

    void m(){
        System.out.println("Inside M");
    }

    void n(){
        System.out.println("Inside N");
        m();
    }

}

// Compiler automatically adds this before m() to invoke current class methods.