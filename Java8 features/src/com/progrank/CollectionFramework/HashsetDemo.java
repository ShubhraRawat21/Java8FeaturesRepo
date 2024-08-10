package src.com.progrank.CollectionFramework;

import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {

        // Object creation
        HashSet<String> hs = new HashSet<String>(100, (float) 0.95);
        hs.add("ghh");
        hs.add("hjh");
        hs.add("vv");
        // hs.remove("ghh");
        for (String string : hs) {
            System.out.println(string);
        }

        // union, intersection, difference
        HashSet<Integer> hs1 = new HashSet<Integer>(100, (float) 0.95);
        hs1.add(2);
        hs1.add(8);
        hs1.add(9);

        HashSet<Integer> hs2 = new HashSet<Integer>(100, (float) 0.95);
        hs2.add(9);
        hs2.add(7);
        hs2.add(8);

        // union
        // hs1.addAll(hs2);
        // System.out.println(hs1);

        // intersection
        // hs2.retainAll(hs1);
        // System.out.println(hs2);

        // difference
        // hs1.removeAll(hs2);
        // System.out.println(hs1);

        // subset
        hs1.containsAll(hs2);
        System.out.println(hs1);
    }
}
