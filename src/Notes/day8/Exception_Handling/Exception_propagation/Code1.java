package Notes.day8.Exception_Handling.Exception_propagation;

class test{
    void m(){
        int data =50/0;
    }

    void n(){
        m();
    }

    void p(){
        try{
            n();
        }catch (Exception exception){
            System.out.println("Exception handled");
        }
    }
}

public class Code1 {

    public static void main(String[] args) {
        test t =new test();
        t.p();

    }

}


/*

Call stack

            m() // not handled back to n();
            n() // again not handled back to p();
            p() // Handled here
            main()

 */