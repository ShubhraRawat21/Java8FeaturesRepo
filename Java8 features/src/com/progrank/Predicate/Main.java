package src.com.progrank.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Predicate returns true/false boolean
//Predicate interface has test() method which accepts object as parameter.
public class Main {
    public static void main(String[] arg) {
        List<Car> carList = Arrays.asList(new Car("Toyota", "White", 300000),
                new Car("Hyundai", "black", 500000),
                new Car("Porche", "magenta", 1000000),
                new Car("BMW", "Black", 900000));

        // Predicate<Car> p = x -> x.getPrice() > 400000 && x.getColor().contains("e");

        // for (Car car : carList) {
        // if (p.test(car))
        // System.out.println(car.getCarName());
        // }

        // *****Through Stream API */

        List<Car> carList1 = carList.stream().filter(x -> (x.getPrice() < 400000 && x.getColor().contains("e")))
                .collect(Collectors.toList());
        for (Car car : carList1) {
            System.out.println(car.getCarName());
        }
    }
}
