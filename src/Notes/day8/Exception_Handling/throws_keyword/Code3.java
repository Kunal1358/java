package Notes.day8.Exception_Handling.throws_keyword;

import java.io.*;
class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
public class Code3{
    public static void main(String args[]){
        try{
            M m=new M();
            m.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }
}

// In case you handle the exception, the code will be executed fine whether
// exception occurs during the program or not.