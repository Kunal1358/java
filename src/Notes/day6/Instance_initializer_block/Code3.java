package Notes.day6.Instance_initializer_block;

class friuts{
    friuts(){
        System.out.println("Parent class ctr");
    }
}

class apple extends friuts{
    public apple() {
        super();
        System.out.println("Child class ctr");
    }
    {
        System.out.println("instance initializer block");
    }
}

public class Code3 {

    public static void main(String[] args) {
        apple a= new apple();
    }
}
