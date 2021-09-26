package Notes.Exception_Handling.throws_keyword;

import java.io.IOException;

public class code1 {

    void m()throws IOException{
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        code1 obj=new code1();
        obj.p();
        System.out.println("normal flow...");

    }
}