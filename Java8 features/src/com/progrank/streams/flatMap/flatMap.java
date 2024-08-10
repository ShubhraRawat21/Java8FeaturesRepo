package src.com.progrank.streams.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flatMap {
    public static void main(String[] args) {
        List<String> lst1 = Arrays.asList("Hari", "Sundar", "Nandmukunda");
        List<String> lst2 = Arrays.asList("Hari", "Narayan", "HariOm");
        List<String> lst3 = Arrays.asList("Girdhari", "Murlidhari", "Govardhan", "Girivardhari");

        List<List<String>> Makhanchor = new ArrayList<List<String>>();
        Makhanchor.add(lst1);
        Makhanchor.add(lst2);
        Makhanchor.add(lst3);

        Makhanchor.stream().flatMap(str -> str.stream().map(str1 -> str1.toLowerCase()))
                .forEach(str2 -> System.out.println(str2));
    }
}
