package DataStructures.Map.HashSet;

import java.util.HashSet;

public class Code1 {

    public static void main(String[] args) {

        HashSet<Integer> s=new HashSet<>();

        s.add(1);
        s.add(22);
        s.add(1);
        s.add(4);
        s.add(5);



        System.out.println(s);

        System.out.println(s.size());

        System.out.println(s.isEmpty());

        System.out.println(s.contains(1));

        s.clear();

        System.out.println();



    }

}


/*

It printDFS map in sorted order
It does not contain duplicate values

//  time comp for all is O(1)



 */