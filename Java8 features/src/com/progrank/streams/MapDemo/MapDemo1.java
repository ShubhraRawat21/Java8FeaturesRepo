package src.com.progrank.streams.MapDemo;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("abc", "def", "radha", "rani");
        // List<String> newlst = new ArrayList<String>();

        // map accepts consumer as parameter
        /*
         * newlst = lst.stream().map(str ->
         * str.toUpperCase()).collect(Collectors.toList());
         * System.out.println(newlst);
         */

        lst.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));

        // numbers example
        List<Integer> numlist = Arrays.asList(34, 89, 45, 30, 24);
        numlist.stream().map(n -> n * 5).forEach(n -> System.out.println(n));

    }
}
