package gr.aueb.cf.ch7;

/**
 * Αν αλλάξουμε το clone, δεν αλλάζει το s,
 * μιας και δημιουργείται νέο String
 */

public class CopyStrApp {

    public static void main(String[] args) {
        String s1 = "CODING FACTORY";
        String s2 = s1;

        s2 = s2.toLowerCase();
        System.out.println(s2);

        String clone;
        clone = s1;
        System.out.println(clone);
    }
}
