package gr.aueb.cf.ch2;

import java.math.BigInteger;

/*
* BigInteger class Demo.
 */
public class BigIntegerApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("2147483647");
        BigInteger bigNum2 = new BigInteger("214748364789");

        BigInteger result;

        //Εντολές
        result = bigNum1.add(bigNum2);

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%,d", result);

    }

}
