package src.com.progrank.streams.filterDemo;

import java.util.Arrays;
import java.util.List;

public class FilterNulls {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dfmmlf", "denj", null, "fdsbm", null);
        words.stream().filter(str -> str != null).forEach(str -> System.out.println(str));
    }
}
