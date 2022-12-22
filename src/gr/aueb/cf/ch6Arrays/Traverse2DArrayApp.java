package gr.aueb.cf.ch6Arrays;

/**
 * Different types of Array traverse.
 *
 *  Έστω ένα jagged array
 * • Για να εμφανίσουμε τα στοιχεία δισδιάστατων πινάκων
 * χρειαζόμαστε δύο for μία μέσα στην άλλη
 * • Παρουσιάζονται τρεις μορφές που κάνουν το ίδιο πράγμα:
 * 1. Με κλασσική for,
 * 2. Με enhanced-for και for και
 * 3. Με δύο enhanced-for
 */
public class Traverse2DArrayApp {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1, 2}, {3, 4, 5}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] row : arr) {
            for(int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
