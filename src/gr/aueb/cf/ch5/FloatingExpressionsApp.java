package gr.aueb.cf.ch5;

/**
 * Παραστάσεις floating point
 */
public class FloatingExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        double  doubleNum = 0.1;
        float floatNum = 10.5F;
        double doubleNum2 = 250;

        float floatResult = 0.0F;
        double doubleResult = 0.0;

        //Αν υπάρχει ένας float μικρότερου μεγέθους οι
        //τύποι μετατρέπονται σε float.
        floatResult = floatNum + intNum;

        //Αν υπάρχει έστω και ένας double, τα intNum
        // και floatNum μετατρέπονται σε double
        doubleResult = doubleNum + floatNum + intNum;

        System.out.printf("FloatResult = %f\n", floatResult);
        System.out.printf("DoubleResult = %f%n", doubleResult);
    }
}
