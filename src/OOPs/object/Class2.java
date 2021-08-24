package OOPs.object;

public class Class2 {

    String str="code2";

    public static void main(String[] args) {

        try {
            Class2 obj= Class2.class.newInstance();

            System.out.println(obj.str);


        }catch (Exception e){
            System.out.println(e);

        }
    }
}
