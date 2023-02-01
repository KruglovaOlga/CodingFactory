package gr.aueb.cf.ch19Collections.streams;

import gr.aueb.cf.ch19Collections.products.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //populate
        List<gr.aueb.cf.ch19Collections.products.Product> products = new ArrayList<>(List.of(
                new Product("A", 2.5, 100),
                new Product("E", 8, 6),
                new Product("A", 4.7, 4),
                new Product("C", 5, 1),
                new Product("H", 6, 7)
        ));

        List<Product> apples = products.stream()
                .filter(product -> product.getDescription().equals("A"))
                .collect(Collectors.toList());

        products.stream()
                .filter(product -> product.getDescription().equals("A"))
                .forEach(System.out::println);

        apples.forEach(System.out::println);

        List<Product> notApples = products.stream()
                .filter(product -> !product.getDescription().equals("A"))
                .sorted(Comparator.comparing(Product::getDescription))
                .collect(Collectors.toList());

        List<Double> prices = products.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());

        List<Product> updatedProductPrices = products.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() + p.getPrice()*0.2, p.getQuantity()))
                .collect(Collectors.toList());

        int applesTotalCount = products.stream()
                .filter(p -> p.getDescription().equals("A"))
                .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);

        int applesSum = products.stream()
                .filter(p -> p.getDescription().equals("A"))
                .mapToInt(Product::getQuantity)
                .sum();

    }
}
