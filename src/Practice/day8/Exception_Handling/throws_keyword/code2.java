package Practice.day8.Exception_Handling.throws_keyword;

import java.io.IOException;

class exp{
    void m() throws IOException{
        throw new IOException("Device Error");
    }

    void n() throws IOException{
        m();
    }

    static void p(){
        try {

        }catch (Exception e){
            System.out.println("Exception handled");
        }

    }
}

public class code2 {
    public static void main(String[] args) {
        exp e=new exp();
        exp.p();
    }
}
