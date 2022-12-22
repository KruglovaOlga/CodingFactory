package gr.aueb.cf.ch6Arrays;

import java.util.Arrays;

/**
 * Η  κλάση  java.util.Arrays παρέχει την μέθοδο copyOf
 * που δημιουργεί ένα αντίγραφο του original πίνακα με length
 * όσο η 2η παράμετρος
 * • Αν το νέο length είναι μικρότερο, αποκόπτει, αν είναι
 * μεγαλύτερο γεμίζει (padding) με μηδενικά
 */
public class ArrayReplaceNextArraysClassApp {

    public static void main(String[] args) {
        int[] ages = {21, 18, 33, 25, 32, 45};

        //Trancates one item at RHS
        ages = Arrays.copyOf(ages, ages.length +1);

        for (int age : ages){
            System.out.print(age + " ");
        }
    }
}
