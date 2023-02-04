package gr.aueb.cf.ch19Collections.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>() {
            {
                put("FI", "Finland");
                put("DE", "Germany");
                put("GL", "Greenland");
            }
        };

        // >=JDK 9
        Map<String, String> countries2 = Map.of(
                "FR", "France",
                "D", "Denmark",
                "IN", "India",
                "MA", "Morocco"

        );

        Map<String, String> countries3 = new HashMap<>(
                Map.of(
                "JP", "Japan",
                "AR", "Argentina"
                )

        );

        countries.put("GR","Greece");
        countries.put("IT", "Italy");
        countries.put("KZ", "Kazakhstan");

        Iterator<Map.Entry<String, String>> it = countries.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
        for (Map.Entry<String, String> entry : countries3.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
