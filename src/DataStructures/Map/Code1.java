package DataStructures.Map;

//  Non-Generic (Old Style)

import java.util.*;

public class Code1 {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

        Set set = map.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
