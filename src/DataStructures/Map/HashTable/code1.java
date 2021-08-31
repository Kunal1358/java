package DataStructures.Map.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class code1 {

    public static void main(String[] args) {

        Hashtable<Integer,String> table=new Hashtable<>();

        // Adding Element
        table.put(1,"A");
        table.put(2,"B");
        table.put(3,"C");
        table.put(4,"D");

        // Changing Element
        table.put(2,"x");

        // Removing the element
        table.remove(2);
        table.remove(6);

        System.out.println(table);

        //  Table2
        Hashtable<String,Integer> table2=new Hashtable<>();
        table2.put("kunal",10);
        table2.put("raj",30);
        table2.put("D",20);

        for(Map.Entry<String,Integer> e : table2.entrySet()){
            System.out.println(e.getKey() + "  " + e.getValue());
        }


    }

}
