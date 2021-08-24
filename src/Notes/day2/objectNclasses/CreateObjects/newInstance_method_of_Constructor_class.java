package Notes.day2.objectNclasses.CreateObjects;

import java.lang.reflect.Constructor;

public class newInstance_method_of_Constructor_class {

    /*
    This is similar to the newInstance() method of a class. There is one newInstance() method
    in the java.lang.reflect.Constructor class which we can use to create objects. It can also call
    parameterized constructor, and private constructor by using this newInstance() method.

    Both newInstance() methods are known as reflective ways to create objects. In fact newInstance()
    method of Class internally uses newInstance() method of Constructor class.
     */


    private String name ="newInstance_method_of_Constructor_class";
     newInstance_method_of_Constructor_class(){
     }

     public void setName(String name){
         this.name=name;
     }

    public static void main(String[] args) {

         try{
             Constructor <newInstance_method_of_Constructor_class> obj= newInstance_method_of_Constructor_class.class.getConstructor();
             newInstance_method_of_Constructor_class obj1=obj.newInstance();

             System.out.println(obj1.name);

         }catch (Exception e){

         }
    }
}
