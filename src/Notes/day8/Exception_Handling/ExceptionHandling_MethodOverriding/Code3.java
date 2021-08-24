package Notes.day8.Exception_Handling.ExceptionHandling_MethodOverriding;

class Parent3 {
    void msg()throws ArithmeticException{System.out.println("parent");}
}

class Code3 extends Parent3 {
// void msg()throws Exception{System.out.println("child");}

    public static void main(String args[]){
        Parent3 p=new Code3();
        try{
            p.msg();
        }catch(Exception e){}
    }
}

/*

Line 9 will give error

 */