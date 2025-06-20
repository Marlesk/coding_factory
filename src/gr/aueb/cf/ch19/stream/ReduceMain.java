package gr.aueb.cf.ch19.stream;

import java.util.List;

public class ReduceMain {
    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Apples", 10, 2.5),
                (new Product("Oranges", 20, 3.25)),
                (new Product("Bananas", 5, 1.25)));

        int sumOfQuantity = products.stream()
                .map(Product::getQuantity)// .map(product -> product.getQuantity())
                .reduce(0,Integer::sum); //reduce(0,(sum,n)->sum+n)
    }
}
