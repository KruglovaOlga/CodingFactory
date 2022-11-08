package gr.aueb.cf.ch5;

/**
 * υπολογίζει το άθροισμα δύο ακεραίων
 * με την χρήση της μεθόδου add
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a,b);
    }

    /**
     * adds two integers
     * @param a the first int
     * @param b the second int to add
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
        /*
        int sum = 0;
        sum = a + b;
        return sum;

         */
    }
}
