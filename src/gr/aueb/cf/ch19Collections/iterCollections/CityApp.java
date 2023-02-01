package gr.aueb.cf.ch19Collections.iterCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityApp {

    public static void main(String[] args) {
        //Populate
        List<String> cities = new ArrayList<>(List.of("Athens", "Sophia", "Riga"));

        //Traverse list
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + " ");
        }
        System.out.println();

        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println();

        cities.forEach(System.out::println);
        System.out.println();

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            if (s.equals("Riga")) it.remove();
            //if (s.equals("Riga")) cities.remove(s);
        }
        System.out.println();

        cities.removeIf(s -> s.equals("London"));

        cities.forEach(System.out::println);
    }
}
