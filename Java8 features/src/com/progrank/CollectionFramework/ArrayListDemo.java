package src.com.progrank.CollectionFramework;

import java.util.*;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> lt = new ArrayList<String>();
        List<String> lst = Arrays.asList("odo", "dkfm", "md", "dmk", "mdmk");
        Collections.sort(lst);
        lt.addAll(lst);
        lt.remove(3);
        for (String string : lt) {
            System.out.println(string);
        }

    }

}
