package OOPs.Class;

public class code1 {

    public static void main(String[] args) {

        System.out.println("inside main");

        inside_main.print();

    }

    static class inside_main{

         static void print(){
            System.out.println("inside other class in code1 ");
        }

    }

}

