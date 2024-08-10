package src.com.progrank.streams.filterDemo;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

public class CustomDataFilter {

    public static void main(String[] args) {
        List<Product> pList = new ArrayList<Product>();
        pList.add(new Product(101, "oil", 80));
        pList.add(new Product(102, "cream", 74));
        pList.add(new Product(101, "turmeric", 83));
        pList.add(new Product(101, "lotion", 94));

        pList.stream().filter(p -> p.price > 80)
                .forEach(p -> System.out.println("[" + p.id + "," + p.name + "," + p.price + "]"));
    }
}
