package Notes.Instance_initializer_block;


class bike{
    int speed;

    bike(){
        System.out.println("Inside Constructor");
    }

    {System.out.println("Inside Instance initializer block");}


}

public class Code2 {
    public static void main(String[] args) {
        bike b=new bike();
    }
}

/*

Instance initializer block is called first?
no, It's called at the same time of object creation

Java compiler compiles the Instance initializer block in
the constructor after the first statement super().

So first constructor is invoked


class bike{
    int speed;
    bike(){
        System.out.println("Inside Constructor");
    }
    {System.out.println("Inside Instance initializer block");}
}


class bike{
    int speed;
    bike(){
        super();
            {System.out.println("Inside Instance initializer block");}
        System.out.println("Inside Constructor");
    }
}




 */
