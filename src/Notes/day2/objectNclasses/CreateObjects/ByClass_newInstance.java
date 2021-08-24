package Notes.day2.objectNclasses.CreateObjects;

public class ByClass_newInstance {

    String str="Hello World!";

    public static void main(String[] args) {
        try{
            /*
            * Method 1 *

            ByClass_newInstance obj= ByClass_newInstance.class.newInstance();
            *
            */
//Method 2
            ByClass_newInstance emp2 = (ByClass_newInstance) Class.forName("Notes.day2.objectNclasses.CreateObjects.ByClass_newInstance").newInstance();
            System.out.println(emp2.str);
/*
            Using Class.forName()
            If we know the name of the class & if it has a public default constructor we can create an object in this way.

            we have to give full package and class path to class.forName
*/
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
