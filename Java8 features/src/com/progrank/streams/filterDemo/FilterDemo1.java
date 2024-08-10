package src.com.progrank.streams.filterDemo;

import java.util.*;
//import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String a[]) {
        List<Integer> nlist = Arrays.asList(25, 30, 58, 35, 40, 58, 392);
        /*
         * List<Integer> elst = new ArrayList<>();
         * 
         * elst = nlist.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
         * System.out.println(elst);
         */

        /*
         * nlist.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
         */

        nlist.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    }
}
