package gr.aueb.cf.ch4;

/**
 * compare two chars
 */
public class CompareApp {

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'α';
        boolean greekIsGreater = false;

        System.out.println(ch1);
        System.out.println(ch2);

        if (ch1 > ch2) {
            greekIsGreater = true;
        }
        System.out.println("ch2 is greater: " + greekIsGreater);
    }
}
