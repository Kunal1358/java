package Notes.this_keyword.Usages;

public class Usage4 {

    public static void main(String[] args) {

        use4 obj=new use4();
        obj.p();
    }

}

class use4{

    void m(use4 obj){
        System.out.println("Inside m");
    }
    
    void p(){
        m(this);
    }

}

/*

Mainly used in event handling

In event handling or in situations where we have to provide reference of class to other class.
    it is used to reuse the class in many methods

 */