package Notes.this_keyword.Usages;

public class Usage3 {

    public static void main(String[] args) {
        use3 obj=new use3(3);
    }
}

class use3{

    use3(){
        System.out.println("Inside 2'nd Constructor");
    }

    use3(int x){
        this();
        System.out.println(x);
    }

}

// here this is used for constructor channing or reusing the constructor.