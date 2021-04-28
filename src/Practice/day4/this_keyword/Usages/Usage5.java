package Practice.day4.this_keyword.Usages;

public class Usage5 {
    public static void main(String[] args) {

        A a = new A();

    }
}

class A{

    int data =10;
    A(){
        B b=new B(this);
        b.display();
    }
}

class B{
    A obj;
    B(A obj){
        this.obj=obj;
    }
    void display(){
        System.out.println(obj.data);
    }

}

/*

here this is passed as argument in ctr call

 */