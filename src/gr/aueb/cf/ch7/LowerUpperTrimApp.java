package gr.aueb.cf.ch7;

import java.util.Locale;

public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "   Athens University";
        String lowercase = "";
        String uppercase = "";
        String trimmed = "";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
    }
}
