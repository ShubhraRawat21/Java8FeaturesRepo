package src.com.progrank.streams.otherMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> vlist = Arrays.asList("Car", "Truck", "Bike", "Scooty", "Car", "Truck");

        // distinct is non-terminal methods
        List<String> distinctvlist = vlist.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctvlist);

        // count is terminal method
        long count = vlist.stream().distinct().count();
        System.out.println(count);

        // limit is non-terminal method
        distinctvlist = vlist.stream().limit(3).collect(Collectors.toList());
        System.out.println("Limited vehicles- " + distinctvlist);

        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 8, 9, 23, 24, 32, 44);

        // count no. of even numbers

        long c = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("NO. OF EVEN NUMBERS - " + c);

        // min() method
        /*
         * min()/max() methods accepts Comparator as arguments
         * syntax - pass 2 arguments
         * compare both the values using compareTo()
         * return type - it will return optional Object of <Integer> type
         */

        Optional<Integer> i = numbers.stream().min((val1, val2) -> {
            return val1.compareTo(val2);
        });
        System.out.println(i.get());

        // reduce()
        /*
         * Reduce is a terminal method
         * Reduce method will combine multiple objects into one object of given
         * collection
         * generally used with map() method
         * return - optional object
         */
        Optional<Integer> obj = numbers.stream().reduce((value, combinedValue) -> {
            return value + combinedValue;
        });
        System.out.println(obj.get());

        // toArray()
        Object arr[] = numbers.stream().toArray();
        System.out.println(arr.length); // u can now perform array operations on this

        for (Object a : arr) {
            System.out.println(a);
        }

        // sorted
        List<Integer> lst = Arrays.asList(213, 1, 2, 323, 13, 3, 21, 5, 6, 7, 8);
        lst.stream().sorted().forEach(ik -> System.out.print("  " + ik));
        System.out.println();
        // sorting in descending order
        lst.stream().sorted(Comparator.reverseOrder()).forEach(ig -> System.out.print("  " + ig));

        vlist.stream().sorted(Comparator.reverseOrder()).forEach(ig -> System.out.print("  " + ig));

        // anyMatch() - accepts predicate as parameter
        // allMatch()- check if all elements satisfy the condition
        Set<String> fruits = new HashSet<String>();
        fruits.add("One Mango");
        fruits.add("Twou Apple");
        fruits.add("Fiv Grapes");
        fruits.add("One banana");
        fruits.add("One chiku");

        boolean result = fruits.stream().anyMatch(value -> {
            return value.startsWith("One");
        });
        System.out.println("\n" + result);

        // findAny()
        /* returns optional */
        Optional<String> fruit = fruits.stream().findFirst();
        System.out.println(fruit.get());

        // concat() method
        // u can add two different types of collections

        Stream<String> s1 = vlist.stream();
        Stream<String> s2 = fruits.stream();

        List<String> flist = Stream.concat(s1, s2).collect(Collectors.toList());
        System.out.println(flist);
    }

}
