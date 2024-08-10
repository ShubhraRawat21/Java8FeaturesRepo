package src.com.progrank.CollectionFramework;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "cdsc");
        hm.put(2, "ds");
        hm.put(2, "cdsc");
        hm.put(4, "defe");
        System.out.println(hm);

        Set s = hm.keySet();
        System.out.println(s);
        System.out.println(hm.values());

        s = hm.entrySet();
        System.out.println(s);

        for (Object i : hm.keySet()) {
            System.out.println("key-" + i + "value-" + hm.get(i));
        }

    }
}
