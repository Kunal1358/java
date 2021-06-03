package Practice.day8.Exception_Handling.throws_keyword;


import java.io.*;
class m {
    void method()throws IOException{
        System.out.println("device operation performed");
    }
}
class Code4{
    public static void main(String args[])throws IOException{//declare exception
        m n=new m();
        n.method();

        System.out.println("normal flow...");
    }
}