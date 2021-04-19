package Practice.day2.objectNclasses.CreateObjects.BySerializingNDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationNobject {
    public static void main(String[] args) {


        try
        {
            DeserializationNobject d;
            FileInputStream f =new FileInputStream("file1.txt");
            ObjectInputStream oos =new ObjectInputStream(f);
            d=(DeserializationNobject)oos.readObject();
     //       System.out.println(d.name);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
