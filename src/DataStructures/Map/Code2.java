package DataStructures.Map;

import java.util.*;

public class Code2 {

    public static void main(String[] args) {

        Map<Integer,String> map=new HashMap<>();

        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }

}
