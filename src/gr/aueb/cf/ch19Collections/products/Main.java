package gr.aueb.cf.ch19Collections.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //populate
        List<Product> products = new ArrayList<>(List.of(
                new Product("O", 2.5, 100),
                new Product("E", 8, 6),
                new Product("A", 4.7, 4),
                new Product("C", 5, 1)
        ));

        //products.sort(Comparator.comparing(Product::getDescription));  //run without interface Comparable
        //products.sort(Comparator.comparing(Product::getDescription))
        //          .thenComparing(Product::getPrice, Comparator.reverseOrder())
        //          .thenComparing(Product::getQuantity));


        Collections.sort(products, Comparator.naturalOrder());
        Collections.sort(products, Comparator.reverseOrder());

        //Collections.sort(products);
        products.forEach(System.out::println);
    }
}
