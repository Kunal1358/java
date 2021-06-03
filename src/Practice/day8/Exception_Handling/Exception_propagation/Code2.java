package Practice.day8.Exception_Handling.Exception_propagation;

class test2{
    void m(){
   //     throw new java.io.IOException("device error");//checked exception
    }

    void n(){
        m();
    }

    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("Exception handled");
        }


    }
}

public class Code2 {
    public static void main(String[] args) {
        test2 t2=new test2();
        t2.p();
    }
}


/*

uncomment line 5

Checked Exceptions are not forwarded in calling chain (propagated)

 */