package Practice.day8.Exception_Handling.ExceptionHandling_MethodOverriding;


import java.io.*;
class Parent4 {
    void msg()throws Exception{System.out.println("parent");}
}

class Code4 extends Parent4 {
    void msg()throws Exception{System.out.println("child");}

    public static void main(String args[]){
        Parent4 p=new Code4();
        try{
            p.msg();
        }catch(Exception e){}
    }
}