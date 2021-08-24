package Notes.day2.objectNclasses.CreateObjects.BySerializingNDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializingNObject implements Serializable {

    private String name;

    public SerializingNObject(String name) {
        this.name=name;
    }

    public static void main(String[] args) {

        try{
            SerializingNObject obj=new SerializingNObject("Kunal");
            FileOutputStream f=new FileOutputStream("file1.txt");
            ObjectOutputStream oos =new ObjectOutputStream(f);
            oos.writeObject(obj);
            oos.close();
            f.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }

}


    /*
    Whenever we serialize and then deserialize an object, JVM creates a separate object.
     In deserialization, JVM doesn’t use any constructor to create the object.
     To deserialize an object we need to implement the Serializable interface in the class.
     */