package DataStructures.Map.HashMap;

import java.util.HashMap;

public class code {

    public static void main(String[] args) {

        HashMap<Integer,String > map=new HashMap<>();

        map.put(11,"A");
        map.put(12,"B");
        map.put(32,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        // Replacing the element
        map.put(6,"Replace");


        // Removing the element
        map.remove(11);
        map.remove(5);

        System.out.println(map);

        //  Table2
        HashMap<String,Integer> map2 =new HashMap<>();
        map2.put("kunal",10);
        map2.put("raj",30);
        map2.put("D",20);

        System.out.println(map);

    }

}
