package gr.aueb.cf.ch6;
/**
 * Η δυαδική αναζήτηση, δηλαδή η αναζήτηση ενός
 * στοιχείου σε ένα ταξινομημένο πίνακα, υλοποιείται με
 * την επιλογή του μεσαίου στοιχείου του πίνακα και την
 * σύγκριση με το στοιχείο που αναζητούμε
 * • Αν το στοιχείο βρεθεί ο αλγόριθμος σταματά διαφορετικά
 * ξανακαλείται αναδρομικά, δηλαδή αν α αριθμός που ψάχνουμε
 * είναι μικρότερος, τότε κάνουμε πάλι δυαδική αναζήτηση στο
 * πάνω-μισό του πίνακα,αν είναι μεγαλύτερος κάνουμε αναζήτηση
 * στο κάτω-μισό, κλπ., μέχρι να βρούμε το στοιχείο με διαδοχικές
 * κατατμήσεις του πίνακα και συγκρίσεις του μεσαίου κάθε φορά στοιχείου
 */
public class BinarySearch {
    public static int[] arr = {2, 5, 7, 9};
    public static void main(String[] args) {
        int low = 0;
        int high = arr.length - 1;
        int position;

        position = binarySearch(9, low, high);

        System.out.println("Position: " + (position + 1) + ", Value: " + arr[position]);
    }

    public static int binarySearch(int value, int low, int high) {
        int mid;
        if (high < low) return -1;
        mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if(value < arr[mid]) return binarySearch(value, low, mid - 1);
        else
            return binarySearch(value, mid + 1, high);
    }
}
