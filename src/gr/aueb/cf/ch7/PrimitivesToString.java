package gr.aueb.cf.ch7;

/**
 * Με την .valueOf() που είναι static μέθοδος της κλάσης
 * String μετατρέπουμε από άλλους τύπους σε String
 */
public class PrimitivesToString {

    public static void main(String[] args) {
        int num = 5;
        float f = 6.64f;
        String s1 = "", s2 = "";

        s1 = String.valueOf(num);
        s2 = String.valueOf(f);

        System.out.println(s1);
        System.out.println(s2);
    }
}
