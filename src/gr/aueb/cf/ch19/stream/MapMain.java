package gr.aueb.cf.ch19.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Apples",10,2.5),
                (new Product("Oranges",20,3.25)),
                (new Product("Bananas",5,1.25)));
        ArrayList<String> listOfFruits = products.stream()
                .map(Product::getName)
                .collect(Collectors.toCollection(ArrayList::new));

        int totalQuantity = products.stream()
                .filter(p -> p.getName().equals("Oranges"))
                .mapToInt(Product::getQuantity)
                .sum();

    }
}
