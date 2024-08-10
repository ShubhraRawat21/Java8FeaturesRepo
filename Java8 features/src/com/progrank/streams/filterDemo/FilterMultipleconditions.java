package src.com.progrank.streams.filterDemo;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class FilterMultipleconditions {
    public static void main(String a[]) {
        List<String> lst = Arrays.asList("Shubhra", "nejkejk", "Shuvani", "Cynthia", "LALALand");
        /*
         * List<String> longname = new ArrayList<>();
         * // filter always takes predicate as argument
         * longname = lst.stream().filter(n -> n.length() > 5 && n.length() <
         * 8).collect(Collectors.toList());
         * System.out.println(longname);
         */

        // forEach method always takes consumer as argument
        lst.stream().filter(n -> n.length() > 5 && n.length() < 8).forEach(n -> System.out.println(n));
    }
}
