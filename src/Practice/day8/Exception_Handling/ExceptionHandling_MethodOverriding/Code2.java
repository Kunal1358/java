package Practice.day8.Exception_Handling.ExceptionHandling_MethodOverriding;


class Parent2{
    void msg(){System.out.println("parent");}
}

class Code2 extends Parent2{
    void msg()throws ArithmeticException{
        System.out.println("child");
    }
    public static void main(String args[]){
        Parent2 p=new Code2();
        p.msg();
    }
}