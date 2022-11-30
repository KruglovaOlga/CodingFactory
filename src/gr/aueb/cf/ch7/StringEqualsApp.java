package gr.aueb.cf.ch7;

import java.util.Locale;

public class StringEqualsApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";
        String s3 = "London";

        boolean isEqual = false;

        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        isEqual = s1.equalsIgnoreCase(s3);

        if (s1.compareTo(s2) == 0)
            System.out.println("EQUAL");
        else System.out.println(" NOT EQUAL");
    }
}
