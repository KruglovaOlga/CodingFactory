package gr.aueb.cf.ch7;

import java.util.Locale;

public class CopyStrApp {

    public static void main(String[] args) {
        String s1 = "Thanassis";
        String s2 = s1;

        s2 = s2.toLowerCase();
        System.out.println(s2);
    }
}
