package Practice.day8.Exception_Handling.throws_keyword;

import java.io.*;
class K {
    void method()throws IOException{
        throw new IOException("device error");
    }
}
class Code5{
    public static void main(String args[])throws IOException{//declare exception
        K m=new K();
        m.method();

        System.out.println("normal flow...");
    }
}