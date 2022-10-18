package gr.aueb.cf.ch2;
/*
* Εμφανίζει στην κονσόλα (std-out) το
* αποτέλεσμα της πρόσθεσης δύο ακεραίων.
 */
public class AddApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 5;
        int num2 = 2_147_483_647;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        //Ετύπωση Αποτελέσματος
        System.out.println("To αποτέλεσμα είναι: " + result);
        System.out.printf("To αποτέλεσμα των %d kai %d einai: %,d\n", num1,num2,result);
    }
}
