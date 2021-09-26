package Notes.objectNclasses.CreateObjects;

public class ByClone implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String str="Hello World!";

    public static void main(String[] args) {

        ByClone obj1 = new ByClone();

        try{

            ByClone obj2= (ByClone) obj1.clone();
            System.out.println(obj2.str);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
