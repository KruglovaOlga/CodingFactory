package gr.aueb.cf.ch19Collections.sets;

import java.util.HashSet;
import java.util.Set;

public class BagOfCoins {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();
        bag.add("1E");
        bag.add("2E");
        bag.add("50 cents");
        bag.add("1 cent");

        bag.forEach(System.out::println);
        bag.remove("1 cent");
        bag.forEach(System.out::println);
    }
}
