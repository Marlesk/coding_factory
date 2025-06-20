package gr.aueb.cf.ch19.stream;

import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
            List<Product> products = List.of(new Product("Apples",10,2.5),
                    (new Product("Oranges",20,3.25)),
                    (new Product("Bananas",5,1.25)));
            var sortedProducts = products.stream()
                    .sorted(Comparator.comparing(Product::getName));
            sortedProducts.forEach(System.out::println);
    }
}
