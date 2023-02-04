package gr.aueb.cf.ch19Collections.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, Product> productMap = new HashMap<>() {
            {
                put("E", new Product("E", "Eggs", 8, 6));
                put("A", new Product("A", "Apples", 4.7, 4));
                put("O", new Product("O","Oranges", 2.1, 38));
                put("C", new Product("C", "Carrot", 5, 1));
                put("M", new Product("M", "Milk", 1.9, 1));
                put("F", new Product("F","Fish", 15, 3));
            }
        };

        Map<String, Object> criteria = new HashMap<>(){{
            put("description", "Eggs");
            put("price", "7.5");
        }};

        String eggs = productMap.values().stream()
                .filter(prod -> prod.getDescription().equals(criteria.get("description"))
                && (Double.compare(prod.getPrice(), (double) criteria.get("price")) > 0))
                .map(Product::toString)
                .collect(Collectors.joining());

        productMap.entrySet().forEach(System.out::println);
        productMap.forEach((k, v) ->System.out.println(k + " " + v));

        String oranges = productMap.entrySet().stream()
                .filter(stringProductEntry -> stringProductEntry.getKey().equals("O"))
                .map(Objects::toString)
                .collect(Collectors.joining(", "));

        System.out.println(oranges);
        System.out.println();

        String productByPrice = productMap.entrySet().stream()
                .filter(stringProductEntry -> stringProductEntry.getValue().getPrice() > 1.9)
                .map(Objects::toString)
                .collect(Collectors.joining("\n "));

        System.out.println(productByPrice);
        System.out.println();

        List<Product> productList = productMap.values().stream()
                .filter(product -> product.getPrice() > 4.2)
                .collect(Collectors.toList());

        productList.forEach(System.out::println);

        int total = productMap.values().stream()
                .filter(product -> product.getPrice() > 6)
                .mapToInt(Product::getQuantity)
                .sum();

        int total2 = productMap.values().stream()
                .filter(product -> product.getPrice() > 8)
                .mapToInt(Product::getQuantity)
                .reduce(0, Integer::sum);

        }


    }

