package Notes.day8.Exception_Handling.ExceptionHandling_MethodOverriding;


class Parent{
    void msg(){System.out.println("parent");}
}

class Code1 extends Parent3 {
//    void msg()throws IOException{
//        System.out.println("TestExceptionChild");
//    }
    public static void main(String args[]){
        Parent3 p=new Code1();
        p.msg();
    }
}

/*

uncomment line 10 - 13 they will give compile time error

 */