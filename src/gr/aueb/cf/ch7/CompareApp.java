package gr.aueb.cf.ch7;

/**
 * το ‘a‘ είναι μεγαλύτερο από το ‘Α‘ με βάση το σύστημα
 * ASCII, το Athens είναι μεγαλύτερο από το Athens
 */
public class CompareApp {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "athens";

        if (s1.compareTo(s2) < 0) System.out.println("'a'thens is greater than 'A'thens");
        if (s2.compareToIgnoreCase(s2) == 0) System.out.println("Are equal ignoring case");
    }
}
